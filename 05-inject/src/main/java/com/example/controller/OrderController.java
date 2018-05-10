package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.OrderService;

//Setter injection
@Component
public class OrderController {
	private OrderService orderService;
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public OrderController() {
		super();
		System.out.println("OrderController constructor");
	}
	
	public void doSomething() {
		orderService.doSomething();
	}
}