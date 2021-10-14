package com.example.service.pk1;

public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("concreteColleague2.receive");
    }

    @Override
    public void send() {
        System.out.println("c2发出!");
        super.getMediator().relay(this);
    }
}