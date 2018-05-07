package com.example.service;

import com.example.component.Courier;

public class FlipKart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public void shopping(String iteams, String address) {
		String status = courier.deliver(iteams, address);
		System.out.println(status);
	}
}