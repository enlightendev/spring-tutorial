package com.enlightendev.spring.jpa.controller;

import com.enlightendev.spring.jpa.domain.Tag;
import com.enlightendev.spring.jpa.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 */
@Controller
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping("/tags/{name}")
    @ResponseBody
    public String getTagByName(@PathVariable("name") String name){
        return tagService.getTagByName(name).getName();
    }

}
