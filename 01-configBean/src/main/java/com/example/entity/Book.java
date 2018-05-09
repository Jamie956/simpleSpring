package com.example.entity;

public class Book {
	private Author author;
	private String title;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Book constructor");
	}

	public Book(Author author, String title) {
		this.author = author;
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + "]";
	}
	
}