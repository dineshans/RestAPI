package com.app.restful.Messanger.service;
import java.util.*;

import com.app.restful.Messanger.database.DatabaseClass;
import com.app.restful.Messanger.model.Message;

public class MessageServiceForCRUD {

	
	private Map<Long, Message> messages=DatabaseClass.getMessages();
	
	public MessageServiceForCRUD()
	{
		messages.put(1L,new Message(1,"Hello World !","Dinesh"));
		messages.put(2L, new Message(2,"Hello jersey","Kaushik Sir"));
	}
	
	
	public List<Message> getAllMessage()
	{
		return new ArrayList<Message>(messages.values());
		
	}
	
	
	public Message getMessage(long id)
	{
		return messages.get(id);
		
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;	
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId() <=0)
		{
			return null;
		}
		
		messages.put(message.getId(), message);
		
		return message;
		
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
	
	
}
