package com.example.util;

import java.io.IOException;
import java.util.Properties;

public class ObjectFactory {
	private static Properties props;
	static {
		props = new Properties();
		try {
			props.load(ObjectFactory.class.getClassLoader().getResourceAsStream("com//example//common//app.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object getInstance(String logicalclassName) {
		Object obj = null;
		String originalclassName = props.getProperty(logicalclassName);
		try {
			obj = Class.forName(originalclassName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
