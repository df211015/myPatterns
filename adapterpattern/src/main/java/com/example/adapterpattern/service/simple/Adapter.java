package com.example.adapterpattern.service.simple;

/**
 * 适配器类
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
