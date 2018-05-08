package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.example.beans.AnotherClass;
import com.example.beans.OneClass;
import com.example.beans.YetAnotherClass;

@Configuration
public class MyConfiguration {

	@Bean
	@RequestScope
	public OneClass myRequestBean() {
		return new OneClass();
	}

	@Bean
	@SessionScope
	public AnotherClass mySessionBean() {
		return new AnotherClass();
	}

	@Bean
	@ApplicationScope
	public YetAnotherClass myApplicationBean() {
		return new YetAnotherClass();
	}
}