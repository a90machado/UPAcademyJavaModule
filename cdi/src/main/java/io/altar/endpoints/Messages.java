package io.altar.endpoints;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import io.altar.messages.MessagesInterface;

@Path("/messages")
public class Messages {

	@Inject
	MessagesInterface messagesInterface; 
	
	@Context
	private UriInfo context;
	
	@GET
	@Path("/healthcheck")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck(){
		return "URI "+context.getRequestUri().toString() + " it's OK!";
	}
	// Return URL and see STATUS
	
	@GET
	@Path("/get/message")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return messagesInterface.send();
	}
	// Return Email send confirmation
	
}
