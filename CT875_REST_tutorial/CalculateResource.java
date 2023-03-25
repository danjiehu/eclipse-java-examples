package ie.nuig.cs.ct875rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("/calculate")
public class CalculateResource {

	@GET
	@Path("/add/{value1}/{value2}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcAddTwoValues(@PathParam("value1")  double value1, @PathParam("value2")  double value2) {
		double answer = value1 + value2;
		String msg = "calcAddTwoValues==> value1: " + value1 + " value2: "+ value2 +" , answer: "+answer;    
		return Response.ok(msg).build();
	}

	@GET
	@Path("/subtract/{value1}/{value2}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcSubTwoValues(@PathParam("value1")  double value1, @PathParam("value2")  double value2) {
		double answer = value1 - value2;
		String msg = "calcSubTwoValues==> value1: " + value1 + " value2: "+ value2 +" , answer: "+answer;		    
		return Response.ok(msg).build();
	}

	@GET
	@Path("/squareroot/{value}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcSqrtHTML(@PathParam("value") double value) {
		double answer = Math.sqrt(value);
		String msg = "calcSqrt==> value: " + value +" , answer: "+answer;
		return Response.ok(msg).build();
	}
}