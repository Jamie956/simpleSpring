package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.controller.ItemController;
import com.example.controller.OrderController;
import com.example.controller.UserController;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderController orderController = context.getBean(OrderController.class);
		orderController.doSomething();
		
//		ItemController itemController = context.getBean(ItemController.class);
//		itemController.doSomething();
//		
//		UserController userController = context.getBean(UserController.class);
//		userController.doSomething();
	}
}