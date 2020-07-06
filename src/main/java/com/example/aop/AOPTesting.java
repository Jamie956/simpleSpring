package com.example.aop;

import org.springframework.aop.framework.ProxyFactory;

public class AOPTesting {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new HelloImpl());
		pf.addAdvice(new HelloBeforeAdvice());
		pf.addAdvice(new HelloAfterAdvice());
		
		IHello helloProxy = (IHello)pf.getProxy();
		helloProxy.greeting("Jamie");
	}
}
