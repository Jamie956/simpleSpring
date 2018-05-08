package com.example;

import org.springframework.stereotype.Component;

@Component("categoryService")
public class Category {
	public void print() {
		System.out.println("category");
	}
}