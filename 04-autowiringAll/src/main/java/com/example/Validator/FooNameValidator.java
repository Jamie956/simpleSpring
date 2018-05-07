package com.example.Validator;

import org.springframework.stereotype.Component;

import com.example.entity.Foo;

@Component(value = "FooNameValidator")
public class FooNameValidator implements FooValidator {
	public Foo validate(Foo foo) {
		// Validation logic goes here.
		return null;
	}
}