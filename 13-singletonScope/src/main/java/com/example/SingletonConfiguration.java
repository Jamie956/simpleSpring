package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SingletonConfiguration {
	@Bean
	public MyBean singletonBean() {
		return new MyBean("singleton");
	}

	@Bean
	@Lazy
	public MyBean lazySingletonBean() {
		return new MyBean("lazy singleton");
	}
}
