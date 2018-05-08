package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonConfiguration.class);
		MyBean singletonBean1 = context.getBean("singletonBean", MyBean.class);
		singletonBean1.setProperty("changed property");

		MyBean singletonBean2 = context.getBean("singletonBean", MyBean.class);

		// System.out.println(singletonBean1.getProperty());
		// System.out.println(singletonBean2.getProperty());
		System.out.println("Retrieving lazy singleton bean...");
		MyBean singletonBean3 = (MyBean) context.getBean("lazySingletonBean");
	}
}
