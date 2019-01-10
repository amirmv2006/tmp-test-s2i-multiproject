package ir.amv.snippets.s2i.springapp;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class TestApp extends ResourceConfig {

    public TestApp() {
        register(DemoRest.class);
    }
}
