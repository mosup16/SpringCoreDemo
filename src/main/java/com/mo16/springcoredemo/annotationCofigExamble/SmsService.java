package com.mo16.springcoredemo.annotationCofigExamble;

public class SmsService implements MessageService{
    @Override
    public void sendMsg(String msg, String receiver) {
        System.out.println(msg + " sms to " + receiver);
    }
}
