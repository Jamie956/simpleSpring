package com.example.Validator;

import org.springframework.stereotype.Component;

import com.example.entity.Foo;

@Component(value = "FooEmailValidator")
public class FooEmailValidator implements FooValidator {
	public Foo validate(Foo foo) {
		System.out.println("FooEmailValidator");
		// Different validation logic goes here.
		return foo;
	}
}