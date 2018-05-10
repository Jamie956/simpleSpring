package com.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Autowired
	private Author author;
	private String title = "It";

	public Author getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}