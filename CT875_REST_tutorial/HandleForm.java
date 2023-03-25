package ie.nuig.cs.ct875rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("/handleform")
public class HandleForm {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String respondToForm(@FormParam("name") String name) {
	        return "The value sent by the form was: '" + name + "'";
	    }
}
