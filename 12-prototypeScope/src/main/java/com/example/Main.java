package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeConfiguration.class);
		MyBean myBean = (MyBean) context.getBean("prototypeBean");
		myBean.setProperty("changed property");
		
		MyBean myBean2 = context.getBean("prototypeBean", MyBean.class);
		
		System.out.println(myBean.getProperty());
		System.out.println(myBean2.getProperty());
	}
}
