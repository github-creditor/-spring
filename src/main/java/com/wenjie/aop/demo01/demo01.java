package com.wenjie.aop.demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext demo = new ClassPathXmlApplicationContext("bean.xml");
        demo01_a a = demo.getBean("a", demo01_a.class);
        a.takea();
    }
}
