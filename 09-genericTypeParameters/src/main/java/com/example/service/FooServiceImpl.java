package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Foo;
import com.example.validator.GenericValidator;

@Service
public class FooServiceImpl implements FooService {
	/** Autowire Foo Validator **/
	@Autowired
	private GenericValidator<Foo> fooValidator;

	public void handleFoo(Foo foo) {
		foo = fooValidator.validate(foo);
	}
}