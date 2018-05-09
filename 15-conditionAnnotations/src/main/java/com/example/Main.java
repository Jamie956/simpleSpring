package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		OrientWebConfigurer orientWebConfigurer = context.getBean(OrientWebConfigurer.class);
	}
}
