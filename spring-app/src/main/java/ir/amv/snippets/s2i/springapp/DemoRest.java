package ir.amv.snippets.s2i.springapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Demo")
public class DemoRest {

    @Path("hi")
    @GET
    public String sayHi() {
        return "Hi";
    }
}
