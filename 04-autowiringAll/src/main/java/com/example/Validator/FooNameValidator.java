package com.example.Validator;

import org.springframework.stereotype.Component;

import com.example.entity.Foo;

@Component(value = "FooNameValidator")
public class FooNameValidator implements FooValidator {
	public Foo validate(Foo foo) {
		System.out.println("FooNameValidator");
		// Validation logic goes here.
		if(foo.getName().length() > 5) {
			foo.setErrorMessage("name length large than 5");
		}
		return foo;
	}
}