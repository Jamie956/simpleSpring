package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.entity.Book;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.refresh();
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor().getFirstName());
		System.out.println(book.getAuthor().getLastName());
	}
}