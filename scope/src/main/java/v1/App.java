package v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("v1/beans.xml");
		WindowGenerator windowGenerator = (WindowGenerator) context.getBean("windowGenerator");
		
		Window window = windowGenerator.createNewWindow();
		Window window2 = windowGenerator.createNewWindow();
		
		System.out.println(window == window2);
	}
}
