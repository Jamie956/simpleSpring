package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entity.Author;
import com.example.entity.Book;

@Configuration
public class AppConfig {
	@Bean
	public Author author1() {
		return new Author();
	}

	@Bean
	public Author author2() {
		return new Author("Steven", "King");
	}

	@Bean
	public Author author3() {
		Author author = new Author();
		author.setFirstName("George");
		author.setLastName("Martin");
		return author;
	}

	@Bean
	public Book book1() {
		return new Book(author2(), "It");
	}

	@Bean
	public Book book2() {
		Book book = new Book();
		book.setAuthor(author3());
		book.setTitle("A Game of Thrones");
		return book;
	}
}
