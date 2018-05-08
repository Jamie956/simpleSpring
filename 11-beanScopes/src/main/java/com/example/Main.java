package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.OneClass;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		OneClass oneClass = (OneClass) context.getBean("myRequestBean");
	}
}
