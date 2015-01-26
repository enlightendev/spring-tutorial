package com.enlightendev.spring.fileupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 *
 */
@Configuration
public class FileUploadConfig {

    private static final String MAX_REQUEST_SIZE = "150MB";

    // This configuration element adds the ability to accept multipart
    // requests to the web container.
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        // Setup the application container to be accept multipart requests
        final MultipartConfigFactory factory = new MultipartConfigFactory();
        // Place upper bounds on the size of the requests to ensure that
        // clients don't abuse the web container by sending huge requests
        factory.setMaxFileSize(MAX_REQUEST_SIZE);
        factory.setMaxRequestSize(MAX_REQUEST_SIZE);

        // Return the configuration to setup multipart in the container
        return factory.createMultipartConfig();
    }
}
