package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeConfiguration {
	@Bean
	@Scope("prototype")
	public MyBean prototypeBean() {
		return new MyBean("prototype");
	}
}
