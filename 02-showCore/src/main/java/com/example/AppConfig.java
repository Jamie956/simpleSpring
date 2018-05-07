package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.documentation.BeanDeclaredInAppConfig;

@Configuration
@ComponentScan("com.example.documentation")
public class AppConfig {
	@Bean
	public BeanDeclaredInAppConfig beanDeclaredInAppConfig() {
		return new BeanDeclaredInAppConfig();
	}
}
