package com.example.pattern.templatepattern.service.customize;

public abstract class TemplatePlus {
    public abstract void init();

    public void op() {
        System.out.println("TemplatePlus --> op start...");
        this.init();
        System.out.println("TemplatePlus --> op end");
    }
}
