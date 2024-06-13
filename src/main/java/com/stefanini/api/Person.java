package com.stefanini.api;

import org.springframework.stereotype.Component;
import javax.ws.rs.Produces;
import java.util.List;
import java.util.UUID;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Component
@Path("/person")
public class Person {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson() {
        return "getPerson";
    }

}
