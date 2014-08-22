package com.enlightendev.spring.jpa.dao;

import com.enlightendev.spring.jpa.domain.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 */
public interface TagRepository extends CrudRepository<Tag, Long> {

    List<Tag> findByName(String name);
}
