package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Foo;
import com.example.validator.FooValidator;

@Service
public class FooServiceImpl implements FooService {
	/** Autowire all classes implementing FooValidator interface **/
	@Autowired
	private List<FooValidator> allValidators;

	public void handleFoo(Foo foo) {
		/** You can use all instances from the list **/
		for (FooValidator validator : allValidators) {
			foo = validator.validate(foo);
		}
	}
}