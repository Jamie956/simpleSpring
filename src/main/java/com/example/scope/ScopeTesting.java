package com.example.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTesting {


    public static void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(context.getBean("getWindow") == context.getBean("getWindow"));

        context.close();
    }


    public static void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println(context.getBean("getUser") == context.getBean("getUser"));

        context.close();
    }

    public static void main(String[] args) {
        test2();
    }
}
