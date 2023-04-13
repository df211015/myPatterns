package com.example.pattern.templatepattern.service.customize;

public class ConcreteTemplate extends TemplatePlus {
    @Override
    public void init() {
        System.out.println("ConcreteTemplate --> init");
    }
}
