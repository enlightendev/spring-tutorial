package com.enlightendev.spring.fileupload.web;

import com.enlightendev.spring.fileupload.web.api.FileIOControllerApi;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import retrofit.RestAdapter;
import retrofit.client.Response;
import retrofit.mime.TypedFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FileIOControllerTest {

	private static final String SERVER = "http://localhost:8080";

    private File testVideoData = new File("src/test/resources/test.mp4");

	private FileIOControllerApi fileIOControllerApi = new RestAdapter.Builder()
			.setEndpoint(SERVER).build()
			.create(FileIOControllerApi.class);

    @Test
    public void testBasicFileUpload(){

        TypedFile file = new TypedFile("video/mp4", testVideoData);
        String result = fileIOControllerApi.uploadBasic("test-file", file);

        System.out.println(result);
    }

    @Test
    public void testStreamData() throws IOException {

        Response response = fileIOControllerApi.streamData("test-file");
        assertEquals(200, response.getStatus());

        InputStream videoData = response.getBody().in();
        byte[] originalFile = IOUtils.toByteArray(new FileInputStream(testVideoData));
        byte[] retrievedFile = IOUtils.toByteArray(videoData);
        assertTrue(Arrays.equals(originalFile, retrievedFile));
    }

}