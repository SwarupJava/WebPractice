package com.ram.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.ram")
@Import({MessagingConfiguration.class})
public class AppConfig {

	//put other application configuration here.
	
	
  /*part 2
   * 
   * spring container reads configuration class.
   * make sure all dependent object are created and autowire properly.
   * JmsTemplate provides an abstraction which hides all complexities of JMS communications.
   * JmsTemplate will take care of creating connection, creating session, creating MessageProducers, creating MessageConsumers, etc.
   * using JmsTemplate, we can send message to queue.
   * Also we can use JmsTemplate to receive message from queue.
   * 
   * 
   * 
   * */

}
