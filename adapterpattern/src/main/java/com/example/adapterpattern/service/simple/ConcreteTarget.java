package com.example.adapterpattern.service.simple;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget -> request");
    }
}
