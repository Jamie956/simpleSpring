package com.example.aop.proxy;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 增强的前后方法
 */
public class GreetingAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("afterReturning");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before");
    }
}