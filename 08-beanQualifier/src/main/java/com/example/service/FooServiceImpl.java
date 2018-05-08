package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Validator.FooValidator;
import com.example.entity.Foo;

@Service
public class FooServiceImpl implements FooService {
	/** Autowire validators individually **/
	@Autowired
	/*
	 * Notice how the String value here matches the value on the @Component
	 * annotation? That's how Spring knows which instance to autowire.
	 */
	@Qualifier("FooNameValidator")
	private FooValidator nameValidator;
	
	@Autowired
	@Qualifier("FooEmailValidator")
	private FooValidator emailValidator;

	public void handleFoo(Foo foo) {
		/** You can use just one instance if you need **/
		foo = nameValidator.validate(foo);
	}
}