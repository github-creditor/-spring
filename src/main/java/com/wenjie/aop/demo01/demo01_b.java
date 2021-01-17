package com.wenjie.aop.demo01;

import org.aspectj.lang.ProceedingJoinPoint;

public class demo01_b {

    public void takeb(){
        System.out.println("这个方法在他执行前执行了");
    }

    public void around(ProceedingJoinPoint pjp){

        try {
            Object[] args = pjp.getArgs();
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("调用了");
    }






}
