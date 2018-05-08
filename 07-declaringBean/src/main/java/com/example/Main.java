package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Using Java based Configuration
		ApplicationContext configContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Order orderService = configContext.getBean(Order.class);
		orderService.print();
		
		//Using XML based configuration
		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
		Item itemService = (Item) xmlContext.getBean("itemService");
		itemService.print();
		
		//Annotation-Driven Component
		ApplicationContext xmlContext2 = new ClassPathXmlApplicationContext("beans2.xml");
		Category categoryService = (Category) xmlContext2.getBean("categoryService");
		categoryService.print();
	}
}