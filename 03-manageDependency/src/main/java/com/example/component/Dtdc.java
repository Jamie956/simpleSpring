package com.example.component;

public class Dtdc implements Courier {
	public String deliver(String iteams, String address) {
		return iteams + "Shiped to Address " + address + "Through Dtdc";
	}
}