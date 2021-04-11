package com.mo16.springcoredemo.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanLifeCycleConfig.xml");
        Customer customer = context.getBean("customer", Customer.class);
        System.out.println("customer name -> " + customer.getName());
//        var messageService = context.getBean(MessageService.class);
        context.registerShutdownHook();
    }
}
