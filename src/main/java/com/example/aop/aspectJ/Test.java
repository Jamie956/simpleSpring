package com.example.aop.aspectJ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    //报错！！！
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectJAnnotation.xml");
        Halo halo = (Halo) context.getBean("haloBeqn");
        halo.greeting();

    }
}
