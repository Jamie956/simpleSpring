package com.example.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void aopTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop-proxy.xml");
        IHalo halo = (IHalo) context.getBean("haloProxy");
        halo.greeting();
    }

}
