package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.FooService;

//Constructor injection
//public class BarClass {
//	private FooService fooService;
//	@Autowired
//	public BarClass(FooService fooService) {
//		this.fooService = fooService;
//	}
//}

//Field injection
//public class BarClass {
//	@Autowired
//	private FooService fooService;
//}

//Setter injection
public class BarClass {
	private FooService fooService;
	@Autowired
	public void setFooService(FooService fooService) {
		this.fooService = fooService;
	}
}