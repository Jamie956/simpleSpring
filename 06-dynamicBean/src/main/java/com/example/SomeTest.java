package com.example;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SomeTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfig.class);
		String exampleString = (String) context.getBean("fromFactory");
		System.out.println(exampleString);
		
		FactoryBean<String> bean = (FactoryBean<String>) context.getBean("&fromFactory");
		System.out.println(bean);
		System.out.println(bean.isSingleton());
		System.out.println(bean.getObjectType());
	}
}