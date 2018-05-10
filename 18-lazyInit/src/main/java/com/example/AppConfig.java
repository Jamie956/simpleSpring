package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.example.bean.A;
import com.example.bean.B;

@Configuration
public class AppConfig {
	@Bean
	public A beanA() {
		return new A();
	}
	
	@Bean
	@Lazy
	public B beanB() {
		return new B();
	}
}
