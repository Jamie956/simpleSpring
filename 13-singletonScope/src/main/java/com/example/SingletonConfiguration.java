package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SingletonConfiguration {
	@Bean
	public MyBean singletonBean() {
		return new MyBean("singleton");
	}
}
