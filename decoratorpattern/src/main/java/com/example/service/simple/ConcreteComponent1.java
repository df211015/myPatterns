package com.example.service.simple;

public class ConcreteComponent1 extends Decorator {

    public ConcreteComponent1(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }

    private void method1() {
        System.out.println("ConreteComponent1 ->mehod1");
    }
}
