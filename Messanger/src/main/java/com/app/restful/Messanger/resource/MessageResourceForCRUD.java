package com.app.restful.Messanger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.restful.Messanger.model.Message;
import com.app.restful.Messanger.service.MessageServiceForCRUD;

@Path("/messagesforCRUD")
public class MessageResourceForCRUD {
	
	MessageServiceForCRUD serviceForCrud=new MessageServiceForCRUD();
		
	
	
	
	//For get the message by URL for all the messages
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return serviceForCrud.getAllMessage();
		
	}
	
	
	//To get the messages by Messageid
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageid}")
	public Message getMessages(@PathParam("messageid") long messageid)
	{
		return serviceForCrud.getMessage(messageid);
		
	}
	
	
	
	//POST implementation
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return serviceForCrud.addMessage(message);
	}
	
	
	//PUT implementation
	@PUT
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageid") long messageid,Message message)
	{
		message.setId(messageid);
		return serviceForCrud.updateMessage(message);
	}
	
	
	//DELETE implementation
	@DELETE
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message deleteMessage(@PathParam("messageid") long messageid)
	{
		
		
		return serviceForCrud.removeMessage(messageid);
	
	
	}
}
