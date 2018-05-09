package com.example;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PropertyCondition implements Condition {
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//		return context.getEnvironment().getProperty("spring.profiles.active") != null;
		return true;
		// optionally check the property value
	}
}