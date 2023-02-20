package com.example.statepattern.simple;

public class ConcreteState1 extends State {

    @Override
    public void handle1() {
        //该状态下的处理逻辑
        System.out.println("ConcreteState1 --> handle1");
    }


    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }

}
