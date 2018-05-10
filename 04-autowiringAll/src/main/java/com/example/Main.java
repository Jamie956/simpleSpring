package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.entity.Foo;
import com.example.service.FooServiceImpl;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.refresh();
		
		FooServiceImpl fooService = context.getBean(FooServiceImpl.class);
		
		Foo foo = new Foo();
		foo.setName("fooname");
		foo.setEmailAddress("fooeamil");
		
		fooService.handleFoo(foo);
		
		System.out.println(foo);
	}
}