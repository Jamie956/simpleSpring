package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	public void doSomething() {
		System.out.println("ItemServiceImpl.doSomething");
	}
}