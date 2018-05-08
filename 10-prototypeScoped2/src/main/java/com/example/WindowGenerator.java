package com.example;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class WindowGenerator {
	public Window generateWindow() {
		Window window = createNewWindow(); // new instance for each call
		return window;
	}
	
	@Lookup
	protected Window createNewWindow() {
		throw new UnsupportedOperationException();
//		return null;
	}
}