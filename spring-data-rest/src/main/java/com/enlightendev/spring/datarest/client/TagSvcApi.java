package com.enlightendev.spring.datarest.client;

import com.enlightendev.spring.datarest.domain.Tag;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

import java.util.Collection;

/**
 * This interface defines an API for a Tag Service. The
 * interface is used to provide a contract for client/server
 * interactions. The interface is annotated with Retrofit
 * annotations so that clients can automatically convert the
 */
public interface TagSvcApi {

    public static final String NAME_PARAMETER = "name";

    public static final String CATEGORY_PARAMETER = "category";

    // The path where we expect the TagSvc to live
    public static final String TAG_SVC_PATH = "/tag";

    // The path to search tags by name
    public static final String TAG_NAME_SEARCH_PATH = TAG_SVC_PATH + "/search/findByName";

    // The path to search tags by title
    public static final String TAG_CATEGORY_SEARCH_PATH = TAG_SVC_PATH + "/search/findByCategory";

    @GET(TAG_SVC_PATH)
    public Collection<Tag> getTagList();

    @POST(TAG_SVC_PATH)
    public Void addTag(@Body Tag v);

    @GET(TAG_NAME_SEARCH_PATH)
    public Collection<Tag> findByName(@Query(NAME_PARAMETER) String name);

    @GET(TAG_CATEGORY_SEARCH_PATH)
    public Collection<Tag> findByCategory(@Query(CATEGORY_PARAMETER) String category);
}
