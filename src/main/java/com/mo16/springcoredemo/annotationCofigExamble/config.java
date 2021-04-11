package com.mo16.springcoredemo.annotationCofigExamble;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public MessageService messageService(){
        return new EmailService();
    }
}
