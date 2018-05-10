package com.example.component;

public class Deer implements Animal {
	public String sayHi(String name, String color) {
		System.out.println("===Deer.sayHi===");
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		return null;
	}
}