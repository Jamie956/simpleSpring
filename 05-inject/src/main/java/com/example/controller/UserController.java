package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.UserService;

//Constructor injection
@Component
public class UserController {
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	public UserController() {
		super();
		System.out.println("UserController constructor");
	}
	
	public void doSomething() {
		userService.doSomething();
	}
}