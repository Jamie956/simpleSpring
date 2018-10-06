package com.example.v2;

public class Item {
	public Item() {
		super();
		System.out.println("Item cons");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
