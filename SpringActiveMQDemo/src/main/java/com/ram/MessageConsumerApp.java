package com.ram;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.ram.config.AppConfig;
import com.ram.receiver.MessageReceiver;

public class MessageConsumerApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
		String response = messageReceiver.receiveMessage();
		System.out.println("Message received = "+response);
		
		((AbstractApplicationContext)context).close();
		
		
		/*part 6
		 * 
		 * here we are defining MessageConsumerApp.
		 * here we created AbstractApplicationContext object by reading spring configuration class.
		 * using getBean() of context object MessageReceiver object from spring container.
		 * calling receiveMessage() of MessageReceiver object to receive message from queue.
		 * once got the response, we are printing[System.out.println("Message received = "+response);]
		 * 
		 * 
		 * */
	}

}
