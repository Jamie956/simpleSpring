package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.entity.Book;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.refresh();
		
		Book book = context.getBean(Book.class);
		System.out.println(book);
		
		context.close();
	}
}