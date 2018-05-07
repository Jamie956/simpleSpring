package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.documentation.BeanConstructorInjection;
import com.example.documentation.BeanDeclaredByAnnotation;
import com.example.documentation.BeanDeclaredInAppConfig;
import com.example.documentation.BeanPostConstructPreDestroy;
import com.example.documentation.BeanPropertyInjection;

public class Main {
	public static void main(String[] args) {
		// initializing the Application Context once per application.
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// bean registered by annotation
		BeanDeclaredByAnnotation beanDeclaredByAnnotation = applicationContext.getBean(BeanDeclaredByAnnotation.class);
		beanDeclaredByAnnotation.sayHello();
		
		// bean registered by Java configuration file
		BeanDeclaredInAppConfig beanDeclaredInAppConfig = applicationContext.getBean(BeanDeclaredInAppConfig.class);
		beanDeclaredInAppConfig.sayHello();
		
		// showcasing constructor injection
		BeanConstructorInjection beanConstructorInjection = applicationContext.getBean(BeanConstructorInjection.class);
		beanConstructorInjection.sayHello();
		
//		// showcasing property injection
		BeanPropertyInjection beanPropertyInjection = applicationContext.getBean(BeanPropertyInjection.class);
		beanPropertyInjection.sayHello();
		
//		// showcasing PreConstruct / PostDestroy hooks
		BeanPostConstructPreDestroy beanPostConstructPreDestroy = applicationContext.getBean(BeanPostConstructPreDestroy.class);
		beanPostConstructPreDestroy.sayHello();
	}
}
