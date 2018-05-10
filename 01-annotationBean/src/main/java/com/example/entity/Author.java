package com.example.entity;

import org.springframework.stereotype.Component;

@Component
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