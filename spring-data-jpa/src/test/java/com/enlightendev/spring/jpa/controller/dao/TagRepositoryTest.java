package com.enlightendev.spring.jpa.controller.dao;

import com.enlightendev.spring.jpa.Main;
import com.enlightendev.spring.jpa.dao.TagRepository;
import com.enlightendev.spring.jpa.domain.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
public class TagRepositoryTest {

    @Autowired
    TagRepository tagRepository;

    @Test
    public void testFindAll() {

        List<Tag> tags = (List<Tag>) tagRepository.findAll();
        assertThat(tags.size(), is(greaterThan(1)));

    }

}
