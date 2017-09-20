/*
package com.js.websys.springboot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.*;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

*/
/**
 * Created by E066932 on 7/20/2017.
 *//*


@Configuration
@Slf4j
public class JerseyServletConfig {

    private static final int LOAD_ORDER = 1;

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    @Profile("local")
    public ServletRegistrationBean jerseyServletLower() {
        log.info("Registering Jersey Servlet : {}", JerseyAppConfig.class.getName());
        return jerseyServlet(JerseyAppConfig.class.getName());
    }

    private ServletRegistrationBean jerseyServlet(String jerseyResourceConfigClassName) {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/v0*/
/*");
        // our rest resources will be available in the path /v0*/
/*
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, jerseyResourceConfigClassName);
        registration.setLoadOnStartup(LOAD_ORDER);
        registration.setName("version0");
        if(log.isDebugEnabled()) {
            printJacksonConfiguration(objectMapper);
        }
        return registration;
    }

    private void printJacksonConfiguration(ObjectMapper objectMapper) {
        log.debug("Printing Jackson ObjectMapper configuration");
        log.debug("################################################################################");
        DeserializationConfig dconfig = objectMapper.getDeserializationConfig();
        log.debug("DeserializationFeatures loop...\n");
        for(DeserializationFeature df : DeserializationFeature.values()) {
            log.debug(df.name() + ": " + dconfig.isEnabled(df));
        }


        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        SerializationConfig sconfig = objectMapper.getSerializationConfig();
        log.debug("Serialization Inclusion: " + sconfig.getSerializationInclusion() + "\n");

        log.debug("SerializationFeatures loop...\n");
        for(SerializationFeature sf : SerializationFeature.values()) {
            log.debug(sf.name() + ": " + sconfig.isEnabled(sf));
        }

        log.debug("Modules loop...\n");
        for (Module m : ObjectMapper.findModules()) {
            log.debug("module name: " + m.getModuleName());
            log.debug("module version: " + m.version());
        }

        log.debug("MapperFeatures loop...\n");
        for(MapperFeature mf : MapperFeature.values()) {
            log.debug(mf.name() + ": " + objectMapper.isEnabled(mf));
        }

        log.debug("Features loop...\n");
        for(JsonFactory.Feature f : JsonFactory.Feature.values()) {
            log.debug(f.name() + ": " + objectMapper.isEnabled(f));
        }
        log.debug("################################################################################");

    }
}
*/
