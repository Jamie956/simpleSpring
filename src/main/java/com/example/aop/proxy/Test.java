package com.example.aop.proxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //Base AOP Proxy
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopProxy.xml");
        IHalo halo = (IHalo) context.getBean("haloProxy");
        halo.greeting();
    }
}
