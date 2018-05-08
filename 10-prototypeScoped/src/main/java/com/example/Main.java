package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		WindowGenerator windowGenerator = (WindowGenerator) context.getBean("windowGenerator");
		
		Window window = windowGenerator.createNewWindow();
		Window window2 = windowGenerator.createNewWindow();
		
		System.out.println(window == window2);
	}
}
