package ie.nuig.cs.ct875rest;

import java.util.ArrayList;

import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.core.Response.Status;

@Singleton
@Path("/employees")
public class EmployeeService {

	Employees list;
	
	public EmployeeService() {
		list = new Employees();
		list.setEmployeeList(new ArrayList<Employee>());
		list.getEmployeeList().add(new Employee(1, "Joe Smith"));
		list.getEmployeeList().add(new Employee(2, "Jane Doe"));
		list.getEmployeeList().add(new Employee(3, "Jack White"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employees getAllEmployees() 
	{
		return list;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee e) 
	{
		list.getEmployeeList().add(e);
		return e;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getEmployee(@PathParam("id") int id) 
	{
		for(Employee e : list.getEmployeeList()) {
			if(e.getId() == id) {
				return Response.ok(e).build();
			}
		}		
		return Response.status(Status.NOT_FOUND).build();
	}
	
}  
