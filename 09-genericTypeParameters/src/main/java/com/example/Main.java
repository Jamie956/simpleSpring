package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.entity.Foo;
import com.example.service.FooServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext Context = new AnnotationConfigApplicationContext(AppConfig.class);
		FooServiceImpl fooServiceImpl = Context.getBean(FooServiceImpl.class);
		
		Foo foo = new Foo();
		foo.setName("fooname");
		fooServiceImpl.handleFoo(foo);
		
		System.out.println(foo);
	}
}