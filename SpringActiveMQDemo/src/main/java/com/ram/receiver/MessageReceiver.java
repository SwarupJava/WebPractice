package com.ram.receiver;

import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;


@Component
public class MessageReceiver {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	MessageConverter messageCoverter;
	
	public String receiveMessage() {
		try {
			/*
			 * here we receive message
			 * 
			 * */
			Message message = jmsTemplate.receive();
			String response = (String) messageCoverter.fromMessage(message);
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	/*
	 * part 4
	 * 
	 * receiveMessage() will responsible for to receive message from queue.
	 * messageCoverter will convert java object to jms message and jms message to java object.
	 * 
	 * */
}
