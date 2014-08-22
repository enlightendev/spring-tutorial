package com.enlightendev.spring.datarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import java.util.List;

@Configuration
@ComponentScan
@EnableJpaRepositories
/**
 * imports a collection of Spring MVC controllers, JSON converters,
 * and other beans needed to provide a RESTful front end.
 * These components link up to the Spring Data JPA backend.
 */
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
    }
}
