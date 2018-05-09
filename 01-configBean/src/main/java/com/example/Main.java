package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.entity.Author;
import com.example.entity.Book;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Author author = (Author) context.getBean("author1");
		Author author2 = (Author) context.getBean("author2");
		Author author3 = (Author) context.getBean("author3");
		Book book = (Book) context.getBean("book1");
		Book book2 = (Book) context.getBean("book2");

		System.out.println(context);
		System.out.println(author);
		System.out.println(author2);
		System.out.println(author3);
		System.out.println(book);
		System.out.println(book2);

	}
}