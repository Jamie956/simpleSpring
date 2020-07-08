package com.example.bean.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("开始初始化容器");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLife.xml");

        System.out.println("xml加载完毕");
        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1);
        System.out.println("关闭容器");
        context.close();

    }

}