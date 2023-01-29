package com.example.compositepattern.service.simple;

import java.util.ArrayList;

public abstract class Component {
    public void doSomething() {
        //todo,业务代码
        System.out.println("Component-->doSomething");
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();
}