package com.example.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    /**
     * Base AOP Proxy
     */
    public static void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop-proxy.xml");
        IHalo halo = (IHalo) context.getBean("haloProxy");
        halo.greeting();
    }

    /**
     * AOP Auto Proxy
     */
    public static void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop-auto-proxy.xml");
        IHalo halo = (IHalo) context.getBean("haloTarget");
        halo.greeting();
    }

    public static void main(String[] args) {
        test2();
    }
}
