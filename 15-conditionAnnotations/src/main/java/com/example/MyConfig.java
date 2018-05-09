package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
//	@ConditionalOnWebApplication
//	@ConditionalOnClass(OObjectDatabaseTx.class)
//	@ConditionalOnMissingBean(OrientWebConfigurer.class)
//	@ConditionalOnResource(resources = "classpath:init-db.sql")
//	@ConditionalOnProperty(value="somebean.enabled", matchIfMissing = true, havingValue="yes")
//	@ConditionalOnExpression("${rest.security.enabled}==false")
	public OrientWebConfigurer orientWebConfigurer() {
		return new OrientWebConfigurer();
	}
}
