package com.enlightendev.spring.datarest.dao;

import com.enlightendev.spring.datarest.client.TagSvcApi;
import com.enlightendev.spring.datarest.domain.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * An interface for a dao that can store Tag
 * objects and allow them to be searched by name.
 */
// This @RepositoryRestResource annotation tells Spring Data Rest to
// expose the TagRepository through a controller and map it to the 
// "/tag" path. This automatically enables you to do the following:
//
// 1. List all tags by sending a GET request to /tag 
// 2. Add a tag by sending a POST request to /tag with the JSON for a tag
// 3. Get a specific tag by sending a GET request to /tag/{tagId}
//    (e.g., /tag/1 would return the JSON for the tag with id=1)
// 4. Send search requests to our findByXYZ methods to /tag/search/findByXYZ
//    (e.g., /tag/search/findByName?name=Foo)
//
@RepositoryRestResource(path = TagSvcApi.TAG_SVC_PATH)
public interface TagRepository extends CrudRepository<Tag, Long> {

    // Find all tags with a matching name (e.g., Tag.name)
    public Collection<Tag> findByName(
            // The @Param annotation tells Spring Data Rest which HTTP request
            // parameter it should use to fill in the "name" variable used to
            // search for Tags
            @Param(TagSvcApi.NAME_PARAMETER) String name);

    // Find all tags with a matching name (e.g., Tag.name)
    public Collection<Tag> findByCategory(
            // The @Param annotation tells Spring Data Rest which HTTP request
            // parameter it should use to fill in the "name" variable used to
            // search for Tags
            @Param(TagSvcApi.CATEGORY_PARAMETER) String category);

	/*
	 * See: http://docs.spring.io/spring-data/jpa/docs/1.3.0.RELEASE/reference/html/jpa.repositories.html 
	 * for more examples of writing query methods
	 */

}
