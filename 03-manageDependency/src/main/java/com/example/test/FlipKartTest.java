package com.example.test;

import com.example.component.Courier;
import com.example.service.FlipKart;
import com.example.util.ObjectFactory;

public class FlipKartTest {
	public static void main(String[] args) {
		Courier courier = (Courier) ObjectFactory.getInstance("Dtdc.class");
		FlipKart flipkart = (FlipKart) ObjectFactory.getInstance("FlipKart.class");
		flipkart.setCourier(courier);
		flipkart.shopping("Hp Laptop", "SR Nagar,Hyderabad");
		
		Courier blueDart = (Courier) ObjectFactory.getInstance("BlueDart.class");
		flipkart.setCourier(blueDart);
		flipkart.shopping("Gold", "Heaven");
	}
}
