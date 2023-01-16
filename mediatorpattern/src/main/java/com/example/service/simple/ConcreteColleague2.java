package com.example.service.simple;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        //todo,处理自己的业务逻辑
        System.out.println("ConcreteColleague2 --> selfMethod2");
    }

    public void depMethod2() {
        //todo,处理自己的业务逻辑
        System.out.println("ConcreteColleague2 --> depMethod2");

        //自己不能处理的逻辑,委托给中介者处理
        super.mediator.doSomething2();
    }
}
