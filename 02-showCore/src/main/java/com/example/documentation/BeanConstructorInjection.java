package com.example.documentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanConstructorInjection {
	private BeanToBeInjected dependency;

	@Autowired
	public BeanConstructorInjection(BeanToBeInjected dependency) {
		this.dependency = dependency;
	}

	public void sayHello() {
		System.out.print("Hello, World from BeanConstructorInjection with dependency: ");
		dependency.sayHello();
	}
}
