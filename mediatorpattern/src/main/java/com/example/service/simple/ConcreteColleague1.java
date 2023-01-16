package com.example.service.simple;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMehod1() {
        //todo,处理自己的业务逻辑
        System.out.println("ConcreteColleague1 --> selfMehod1");
    }

    public void depMethod1() {
        //todo,处理自己的业务逻辑
        System.out.println("ConcreteColleague1 --> depMethod1");

        //自己不能处理的逻辑,委托给中介者处理
        super.mediator.doSomething1();
    }
}
