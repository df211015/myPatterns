package com.example.service.pk2;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        super.getMediator().send(this, msg);
    }

    @Override
    public void notify(String msg) {
        System.out.println("02得到消息：" + msg);
    }
}
