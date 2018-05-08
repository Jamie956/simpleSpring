package com.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
	
	@Bean
	@Lazy
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Window window() {
		return new Window();
	}

	@Bean
	public WindowGenerator windowGenerator() {
		return new WindowGenerator() {
			@Override
			protected Window createNewWindow() {
				return window();
			}
		};
	}
}