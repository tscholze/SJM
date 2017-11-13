package com.github.skare69.sjm;

import org.glassfish.jersey.message.GZipEncoder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.filter.EncodingFilter;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

/**
 * JAX-RS Configuration.
 */
@ApplicationPath("1")
public class JAXRSConfiguration
        extends ResourceConfig {
    public JAXRSConfiguration() {
        super();
        packages("com.github.skare69.sjm");
        EncodingFilter.enableFor(this, GZipEncoder.class);
        register(RolesAllowedDynamicFeature.class);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }
}
