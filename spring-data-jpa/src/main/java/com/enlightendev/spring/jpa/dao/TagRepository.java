package com.enlightendev.spring.jpa.dao;

import com.enlightendev.spring.jpa.domain.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
@Component
public interface TagRepository extends CrudRepository<Tag, Long> {

    List<Tag> findByName(String name);
}
