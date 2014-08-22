package com.enlightendev.spring.fileupload.web.api;

import retrofit.client.Response;
import retrofit.http.*;
import retrofit.mime.TypedFile;

public interface FileIOControllerApi {

    @Multipart
    @POST("/fileio/upload")
    public String uploadBasic(@Query("name") String name, @Part("file") TypedFile file);

    @Streaming
    @GET("/fileio/stream/{name}")
    Response streamData(@Path("name") String name);
}
