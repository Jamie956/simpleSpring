package com.example;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class ExampleFactoryBean extends AbstractFactoryBean<String> {
	// This method determines the type of the bean for autowiring purposes
	@Override
	public Class<?> getObjectType() {
		return String.class;
	}

	// this factory method produces the actual bean
	@Override
	protected String createInstance() throws Exception {
		// The thing you return can be defined dynamically,
		// that is read from a file, database, network or just
		// simply randomly generated if you wish.
		return "Something from factory";
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}