package com.example.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	@Bean
//	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Scope("prototype")
	public Window getWindow() {
		return new Window();
	}

}