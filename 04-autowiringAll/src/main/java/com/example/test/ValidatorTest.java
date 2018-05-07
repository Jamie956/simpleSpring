package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.AppConfig;
import com.example.entity.Foo;
import com.example.service.FooServiceImpl;

public class ValidatorTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		FooServiceImpl fooService = applicationContext.getBean(FooServiceImpl.class);
		
		Foo foo = new Foo();
		foo.setName("fooname");
		foo.setEmailAddress("fooeamil");
		
		fooService.handleFoo(foo);
		
		System.out.println(foo);
	}
}