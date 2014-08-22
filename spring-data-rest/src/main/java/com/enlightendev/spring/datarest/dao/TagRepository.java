package com.enlightendev.spring.datarest.dao;

import com.enlightendev.spring.datarest.domain.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 *
 */
public class TagRepository {

    @RepositoryRestResource(collectionResourceRel = "tags", path = "tags")
    public interface PersonRepository extends PagingAndSortingRepository<Tag, Long> {

        List<Tag> findByName(@Param("name") String name);

    }
}
