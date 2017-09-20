package com.js.websys.springboot;


import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;


/**
 * Created by E066932 on 7/14/2017.
 */

@Slf4j
@ApplicationPath("/restservice")
public class JerseyAppConfig extends ResourceConfig{

    public JerseyAppConfig() {
        log.debug("Registering resources with Jersey 2.x==============>>");
        packages("com.js.websys.springboot");

        register(MultiPartFeature.class);
    }

}
