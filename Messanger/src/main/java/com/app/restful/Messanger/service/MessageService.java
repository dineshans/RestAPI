package com.app.restful.Messanger.service;

import java.util.*;

import com.app.restful.Messanger.model.Message;

public class MessageService {
	
	
	public List<Message> getAllMessage()
	{
		
		Message msg1=new Message(1L,"Hello World","Dinesh");
		Message msg2=new Message(2L,"Hello jersey","Kaushik Sir");
		
		List <Message> list=new ArrayList();
		
		list.add(msg1);
		list.add(msg2);
		
		return list;
		
		
	}

}
