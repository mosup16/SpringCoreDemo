package com.mo16.springcoredemo.annotationCofigExamble;

public class EmailService implements MessageService{
    @Override
    public void sendMsg(String msg, String receiver) {
        System.out.println(msg + " mail to " + receiver);
    }
}
