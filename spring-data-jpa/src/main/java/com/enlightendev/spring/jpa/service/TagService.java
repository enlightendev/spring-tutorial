package com.enlightendev.spring.jpa.service;

import com.enlightendev.spring.jpa.dao.TagRepository;
import com.enlightendev.spring.jpa.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 */
@Component("tagService")
@Transactional
public class TagService {

    private final TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Tag getTagByName(String name){
        List<Tag> tags = tagRepository.findByName(name);
        if(tags.size() <= 0){
            return new Tag("no tags", "no tags");
        }else{
            return tags.get(0);
        }
    }


}
