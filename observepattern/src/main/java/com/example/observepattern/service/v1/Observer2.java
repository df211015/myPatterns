package com.example.observepattern.service.v1;

public class Observer2 implements Observer {
    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(String.format("Observer2-->update收到消息:%s", msg));
    }
}
