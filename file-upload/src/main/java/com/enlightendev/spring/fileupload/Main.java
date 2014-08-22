package com.enlightendev.spring.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Main class with the components
 */
//tags the class as a source of bean definitions for the application context.
@Configuration

//tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
@EnableAutoConfiguration

//tells Spring to look for other components, configurations, and services in the the hello package, allowing it to find Controllers
@ComponentScan
public class Main {

    public static void main(String[] args) {

        //All that is needed to get app running.
        ApplicationContext ctx = SpringApplication.run(Main.class, args);

        //OPTIONAL
        System.out.println("Beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }

}
