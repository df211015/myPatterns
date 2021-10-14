package com.example.service.pk1;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("concreteColleague1.receive");
    }

    @Override
    public void send() {
        System.out.println("c1发出!");
        super.getMediator().relay(this);
    }
}