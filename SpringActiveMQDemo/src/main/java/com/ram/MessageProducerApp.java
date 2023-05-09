package com.ram;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.ram.config.AppConfig;
import com.ram.producer.MessageSender;

public class MessageProducerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage("Hi peter how are you?");
        System.out.println("Message has been sent successfully");
        
        ((AbstractApplicationContext)context).close();
        
        
        
        /*part 5
         * 
         * here we are defining MessageProducerApp.
         * here we are created AbstractApplicationContext object by reading spring configuration class.
         * using context object, MessageSender object from spring container and calling sendMessage() of MessageSender object to send the message to queue.
         * 
         * */
	}

}
