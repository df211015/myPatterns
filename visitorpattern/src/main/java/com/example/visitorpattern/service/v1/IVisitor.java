package com.example.visitorpattern.service.v1;

public interface IVisitor {
    void visit(CommonEmployee commonEmployee);
    void visit(Manager manager);
}
