package com.ram.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired(required=true)
	JmsTemplate jmsTemplate;
	
	public void sendMessage(final String message) {
		jmsTemplate.send(new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				ObjectMessage objectMessage = session.createObjectMessage(message);
				return objectMessage;
			}
		});
	}
	
	
	/*part3
	 * 
	 * sendMessage() will responsible for sending message to queue.
	 * 
	 * 
	 * */
}
