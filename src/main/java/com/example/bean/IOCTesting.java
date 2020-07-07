package com.example.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTesting {
    //component annotation test
    public static void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example.bean");
        context.refresh();

        context.getBean(Student.class);

        context.close();
    }

    //autowired inject dependency field
    public static void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example.bean");
        context.refresh();

        context.getBean(Book.class);

        context.close();
    }

    //configuration annotation scan and bean IOC
    public static void test3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean("getPerson");

        context.close();
    }

    //IOC - base XML
    public static void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("userBean");
        user.show();

        context.close();
    }

    public static void main(String[] args) {
        test1();
    }
}