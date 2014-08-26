package com.enlightendev.spring.restservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableAutoConfiguration
/**
 * In the case of rest this annotation detects jackson and jaxb in classpath and registers default converters.
 * when more complex config is needed, remove the annotation and extend
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
 * org.springframework.web.servlet.config.annotation.WebMvcConfigurer
 */
@EnableWebMvc
public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
    }
}
