package main.java.com.stefanini.config;

import org.springframework.stereotype.Component;

import com.stefanini.api.Person;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/stefanini")
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig() {
		register(Person.class);
	}

}