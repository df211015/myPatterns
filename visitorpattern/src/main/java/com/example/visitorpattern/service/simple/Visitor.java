package com.example.visitorpattern.service.simple;

public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 e1) {
        e1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 e2) {
        e2.doSomething();
    }
}
