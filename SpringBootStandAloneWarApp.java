package com.js.websys.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by E066932 on 7/14/2017.
 */


@Slf4j
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class })
@EnableCaching
@SpringBootApplication
public class SpringBootStandAloneWarApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootStandAloneWarApp.class);
    }

    public static void main(String[] args) {
        log.debug("In SpringBootStandAloneWarApp=================================>>>>>");
        SpringApplication.run(SpringBootStandAloneWarApp.class, args);
    }
}

