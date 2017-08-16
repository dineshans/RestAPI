package com.app.restful.Messanger.resource;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.app.restful.Messanger.model.Message;
import com.app.restful.Messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	
	MessageService msgService=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage()
	{
		
		
		return msgService.getAllMessage();
		
	}
	
	

}
