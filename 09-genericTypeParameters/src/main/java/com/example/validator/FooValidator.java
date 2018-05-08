package com.example.validator;

import org.springframework.stereotype.Component;

import com.example.entity.Foo;

@Component
public class FooValidator implements GenericValidator<Foo> {
	public Foo validate(Foo foo) {
		// Logic here to validate foo objects.
		System.out.println("FooValidator.validate");
		foo.setName("update fooname");
		return foo;
	}
}