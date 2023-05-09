package com.ram.config;

import java.util.Arrays;
import javax.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.SimpleMessageConverter;

import com.ram.receiver.MessageReceiver;

@Configuration
public class MessagingConfiguration {

	private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616";
	private static final String MESSAGE_QUEUE = "message_queue";
	
	@Autowired
	MessageReceiver messageReceiver;
	
	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
		connectionFactory.setTrustedPackages(Arrays.asList("com.ram"));
		return connectionFactory;
	}
	
	/*
	 * using here for sending messages
	 * 
	 * */
	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory());
		jmsTemplate.setDefaultDestinationName(MESSAGE_QUEUE);
		return jmsTemplate;
	}
	
	    @Bean
	    MessageConverter  converter(){
	    	return new SimpleMessageConverter();
	    }
	    
	    
	    /*
	     * part1:
	     * 
	     * MessagingConfiguration is a configuration class.
	     * Spring Container reads configuration class and create connection factory object.
	     * To create connection factory object spring container know ActiveMQ broker url.
	     * Once Connection factory object is created, Spring container creates JMS template object.
	     * To create jms template object, spring container know connection factory object and message queue.
	     * here we are defining message queue.
	     * Spring container creates message converter 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * */
	
}
