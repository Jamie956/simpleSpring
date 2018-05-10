package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		NexusBean nexusBean= context.getBean(NexusBean.class);
		
		System.out.println(nexusBean.getUser());
		System.out.println(nexusBean.getPass());
		System.out.println(nexusBean.getRestUri());
	}
}