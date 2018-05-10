package com.example.component;

public class Dog implements Animal {
	public String sayHi(String name, String color) {
		System.out.println("===Dog.sayHi===");
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		return null;
	}
}