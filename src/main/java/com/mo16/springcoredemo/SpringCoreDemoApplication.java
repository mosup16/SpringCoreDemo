package com.mo16.springcoredemo;

import com.mo16.springcoredemo.annotationCofigExamble.MessageService;
import com.mo16.springcoredemo.beanLifeCycle.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCoreDemoApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringCoreDemoApplication.class, args);
        var messageService = context.getBean(MessageService.class);
        messageService.sendMsg("hi","mo");

    }

    @Bean
    public Customer customer(){
        return new Customer();
    }

}
