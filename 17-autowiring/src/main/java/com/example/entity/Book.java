package com.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // The annotation that specifies to include this as a bean
// in the ApplicationContext
public class Book {
	@Autowired // The annotation that wires the below defined Author
	// instance into this bean
	private Author author;
	private String title = "It";

	public Author getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
