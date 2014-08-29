package com.enlightendev.spring.datarest.integration.test;

import com.enlightendev.spring.datarest.client.TagSvcApi;
import com.enlightendev.spring.datarest.domain.Tag;
import org.junit.Test;
import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

/**
 * 
 * This integration test sends a POST request to the TagServlet to add a new tag 
 * and then sends a second GET request to check that the tag showed up in the list
 * of tags. Actual network communication using HTTP is performed with this test.
 * 
 * The test requires that the TagSvc be running first (see the directions in
 * the README.md file for how to launch the Application).
 * 
 * To run this test, right-click on it in Eclipse and select
 * "Run As"->"JUnit Test"
 * 
 * Pay attention to how this test that actually uses HTTP and the test that just
 * directly makes method calls on a TagSvc object are essentially identical.
 * All that changes is the setup of the tagService variable. Yes, this could
 * be refactored to eliminate code duplication...but the goal was to show how
 * much Retrofit simplifies interaction with our service!
 * 
 * @author jules
 *
 */
public class TagSvcClientApiTest {

	private final String TEST_URL = "http://localhost:8080";

	private TagSvcApi tagService = new RestAdapter.Builder()
			.setEndpoint(TEST_URL).setLogLevel(LogLevel.FULL).build()
			.create(TagSvcApi.class);
	
	/**
	 * This test creates a Tag, adds the Tag to the TagSvc, and then
	 * checks that the Tag is included in the list when getTagList() is
	 * called.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testTagAddAndList() throws Exception {

        Tag tag1 = new Tag("test-client", "client", "a tag to test from client");

		// Add the tag
		tagService.addTag(tag1);

        tagService.addTag(new Tag("test-server", "server", "server tag description"));
        tagService.addTag(new Tag("test-server-2", "server", "server 2 tag description"));
		
		// We should get back the tag that we added above
		Collection<Tag> tags = tagService.getTagList();
		assertTrue(tags.contains(tag1));
	}

}
