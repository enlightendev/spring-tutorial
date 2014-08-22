package com.enlightendev.spring.jpa;

import com.enlightendev.spring.jpa.dao.TagRepository;
import com.enlightendev.spring.jpa.domain.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        TagRepository tagRepository = context.getBean(TagRepository.class);

        tagRepository.save(new Tag("etf", "etf funds"));
        tagRepository.save(new Tag("futures", "futuresd trades"));

        //fetch
        Iterable<Tag> tags = tagRepository.findAll();
        System.out.println("tags found with findAll():");
        System.out.println("-------------------------------");
        for (Tag tag : tags) {
            System.out.println(tag);
        }
        System.out.println();

    }

}
