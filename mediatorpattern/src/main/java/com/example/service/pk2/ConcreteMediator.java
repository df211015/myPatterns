package com.example.service.pk2;

public class ConcreteMediator extends Mediator {
    @Override
    public void send(Colleague colleague, String msg) {
        if (colleague == super.getColleague1()) {
            super.getColleague2().notify(msg);
        } else {
            super.getColleague1().notify(msg);
        }
    }
}
