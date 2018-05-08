package com.example;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {
	@Bean
	public FactoryBean<String> fromFactory() {
		return new ExampleFactoryBean();
	}
}