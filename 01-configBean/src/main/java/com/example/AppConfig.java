package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entity.Author;
import com.example.entity.Book;

@Configuration
public class AppConfig {
	@Bean
	public String foo() {
		return "function foo";
	}

	@Bean
	public Author authorBean() {
		Author bean = new Author();
		bean.setFirstName("Jamie");
		bean.setLastName("Zhou");
		return bean;
	}

	@Bean
	public Book bookBean() {
		Book book = new Book();
		Author author = authorBean();
		book.setAuthor(author);
		book.setTitle("Bene");
		return book;
	}
}
