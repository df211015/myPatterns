package com.example.pattern.templatepattern.service.v1;

public class ConcreteTemplate extends Template {
    @Override
    public void print(String msg) {
        System.out.println(String.format("类名:%s,消息内容:%s", this.getClass().toString(), msg));
    }
}
