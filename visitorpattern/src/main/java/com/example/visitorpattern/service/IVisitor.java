package com.example.visitorpattern.service;

public interface IVisitor {
    void visit(CommonEmployee commonEmployee);
    void visit(Manager manager);
}
