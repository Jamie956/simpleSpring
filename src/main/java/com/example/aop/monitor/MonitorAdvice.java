package com.example.aop.monitor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Around;

import java.util.Date;

public class MonitorAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            return invocation.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    @Override
//    public Object invoke(MethodInvocation invocation) throws Throwable {
//
//        Date date = new Date();
//        long start = System.currentTimeMillis();
//        Object obj = invocation.proceed();
//        long consume = System.currentTimeMillis() - start;
//
//        MonitorTime monitorTime = new MonitorTime();
//        monitorTime.setClassName(invocation.getClass().getName());
//        monitorTime.setClassName(invocation.getMethod().getName());
//        monitorTime.setLogTime(date);
//        monitorTime.setComsumeTime(consume);
//
//        System.out.println(monitorTime);
//        return obj;
//    }


}
