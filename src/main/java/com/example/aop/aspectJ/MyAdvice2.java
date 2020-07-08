package com.example.aop.aspectJ;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component("MyAdvice2")
public class MyAdvice2 {
//@Pointcut("execution(public String org.baeldung.dao.FooDao.findById(Long))")
    @Pointcut("execution(public void com.example.aop.aspectJ.Halo.greeting())")
    public void greetingPoint() {
    }

    @Before("greetingPoint()")
    public void beforeGreeting() {
        System.out.println("before");
    }

    @AfterReturning("greetingPoint()")
    public void afterReturnGreeting() {
        System.out.println("return return");

    }
}