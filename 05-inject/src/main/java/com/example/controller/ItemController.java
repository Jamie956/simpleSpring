package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.ItemService;

//Field injection
@Component
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	public ItemController() {
	}
	
	public void doSomething() {
		itemService.doSomething();
	}
}