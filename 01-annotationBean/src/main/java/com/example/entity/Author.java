package com.example.entity;

import org.springframework.stereotype.Component;

@Component // The annotation that specifies to include
// this as a bean in the ApplicationContext
public class Author {
	private String firstName = "Steven";
	private String lastName = "King";

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}