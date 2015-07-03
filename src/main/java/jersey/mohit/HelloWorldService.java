package jersey.mohit;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.core.Response;

//http://localhost:8080/jersey/rest/hello/mohit
@Path("/hello")
public class HelloWorldService {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		
		String output = "Jersey Say " + msg;
		return Response.status(200).entity(output).build();
	
	}
}
