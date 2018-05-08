package com.example;

public class MyBean {
	private String property;

	public MyBean(String property) {
		this.property = property;
		System.out.println("Initializing {} bean..."+property);
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
}