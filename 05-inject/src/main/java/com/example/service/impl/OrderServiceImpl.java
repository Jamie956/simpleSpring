package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	public void doSomething() {
		System.out.println("OrderServiceImpl.doSomething");
	}
}