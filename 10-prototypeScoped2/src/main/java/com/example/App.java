package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		WindowGenerator windowGenerator = context.getBean(WindowGenerator.class);
//		
//		Window window = windowGenerator.createNewWindow();
//		Window window2 = windowGenerator.createNewWindow();
//		System.out.println(window == window2);
		Window window = (Window) context.getBean("window");
		System.out.println(window);
	}
}
