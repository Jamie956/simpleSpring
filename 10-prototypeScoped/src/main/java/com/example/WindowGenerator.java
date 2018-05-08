package com.example;

public abstract class WindowGenerator {
	public Window generateWindow() {
		Window window = createNewWindow(); // new instance for each call
		return window;
	}

	protected abstract Window createNewWindow(); // lookup method
}