package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext configContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
		WindowGenerator windowGenerator = configContext.getBean(WindowGenerator.class);
		
		Window window = windowGenerator.createNewWindow();
		Window window2 = windowGenerator.createNewWindow();
		System.out.println(window == window2);
	}
}
