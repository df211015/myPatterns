package com.example.service.pk2;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        super.getMediator().send(this, msg);
    }

    @Override
    public void notify(String msg) {
        System.out.println("01得到消息：" + msg);
    }
}
