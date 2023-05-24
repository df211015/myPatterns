package com.example.observepattern.service.v1;

public class Observer1 implements Observer {
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(String.format("Observer1-->update收到消息:%s", msg));
    }
}
