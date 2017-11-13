package com.github.skare69.sjm.boundary;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST endpoint for testing.
 */
@Stateless
@Path("/")
public class TestResource {
    @GET
    public JsonObject testResponse() {
        return Json.createObjectBuilder().add("foo", "bar").build();
    }
}
