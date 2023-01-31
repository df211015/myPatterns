package com.example.service.simple;

public class ConcreteComponent2 extends Decorator {
    public ConcreteComponent2(Component component) {
        super(component);
    }

    private void methed2() {
        System.out.println("ConcreteComponent2 -> method2");
    }

    @Override
    public void operate() {
        super.operate();
        this.methed2();
    }
}
