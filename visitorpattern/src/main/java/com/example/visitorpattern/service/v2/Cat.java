package com.example.visitorpattern.service.v2;

public class Cat extends Animal {
    public Cat(String name, String features, String description) {
        super(name, features, description);
    }

    @Override
    public void getAdvantages() {
        System.out.println("a lovely cat!");
    }

    @Override
    public void visit(IVisitor visitor) {
        visitor.visit(this);
    }
}
