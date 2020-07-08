package com.example.aop.proxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    /**
     * Base AOP Proxy
     */
    public static void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopProxy.xml");
        IHalo halo = (IHalo) context.getBean("haloProxy");
        halo.greeting();
    }

    /**
     * AOP Auto Proxy
     */
    public static void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopAutoProxy.xml");
        IHalo halo = (IHalo) context.getBean("halo");
        halo.greeting();
    }

    public static void main(String[] args) {
        test2();
    }
}
