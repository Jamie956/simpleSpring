package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	public void doSomething() {
		System.out.println("UserServiceImpl.doSomething");
	}
}