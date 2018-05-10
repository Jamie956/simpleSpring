package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ConcurrentTaskExecutor taskExecutor = (ConcurrentTaskExecutor) context.getBean("taskExecutor");
		taskExecutor.getConcurrentExecutor();
	}
}