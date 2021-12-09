package com.example.compositepattern.service.v2;

public abstract class Component {
    public String getName() {
        return name;
    }

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
