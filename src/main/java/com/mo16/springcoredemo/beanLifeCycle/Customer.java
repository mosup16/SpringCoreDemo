package com.mo16.springcoredemo.beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public Customer() {
        System.out.println("no-args constructor..");
    }

    public Customer(String name) {
        this.name = name;
        System.out.println("constructor set name to " + name + " ..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName(name) set name to " + name + " ..");
        this.name = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware -> " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware name ->"+ s);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("ApplicationContext -> " + context);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet..");
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct..");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBeen destroy...");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("@PreDestroy...");
    }
}
