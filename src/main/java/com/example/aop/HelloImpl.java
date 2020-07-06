package com.example.aop;

public class HelloImpl implements IHello{

	public void greeting(String name) {
		System.out.println("Hi "+name);
	}

}
