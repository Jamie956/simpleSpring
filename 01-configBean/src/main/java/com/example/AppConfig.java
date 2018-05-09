package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entity.Author;
import com.example.entity.Book;

@Configuration // This annotation tells the ApplicationContext that this class contains bean definitions.
public class AppConfig {
	/**
	 * An Author created with the default constructor setting no properties
	 */
	@Bean // This annotation marks a method that defines a bean
	public Author author1() {
		return new Author();
	}

	/**
	 * An Author created with the constructor that initializes the name fields
	 */
	@Bean
	public Author author2() {
		return new Author("Steven", "King");
	}

	/**
	 * An Author created with the default constructor, but then uses the
	 * property setters to specify name fields
	 */
	@Bean
	public Author author3() {
		Author author = new Author();
		author.setFirstName("George");
		author.setLastName("Martin");
		return author;
	}

	/**
	 * A Book created referring to author2 (created above) via a constructor
	 * argument. The dependency is fulfilled by invoking the method as plain
	 * Java.
	 */
	@Bean
	public Book book1() {
		return new Book(author2(), "It");
	}

	/**
	 * A Book created referring to author3 (created above) via a property
	 * setter. The dependency is fulfilled by invoking the method as plain Java.
	 */
	@Bean
	public Book book2() {
		Book book = new Book();
		book.setAuthor(author3());
		book.setTitle("A Game of Thrones");
		return book;
	}
}
