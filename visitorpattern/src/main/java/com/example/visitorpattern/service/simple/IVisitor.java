package com.example.visitorpattern.service.simple;

public interface IVisitor {
    /**
     * 可访问的对像
     *
     * @param e1
     */
    void visit(ConcreteElement1 e1);

    /**
     * 可访问的对像
     *
     * @param e2
     */
    void visit(ConcreteElement2 e2);
}