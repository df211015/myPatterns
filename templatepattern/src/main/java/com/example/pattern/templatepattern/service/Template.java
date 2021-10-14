package com.example.pattern.templatepattern.service;

public abstract class Template {
    public abstract void print(String msg);

    public void process(String msg) {
        System.out.println(String.format("类名:%s", this.getClass().toString()));
        for (int i = 0; i < 10; i++) {
            this.print(msg);
        }
    }
}
