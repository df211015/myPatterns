package com.example.visitorpattern.service.customize;

public class ParentVistor implements IVisitorPlus {
    @Override
    public void visit(ElementPlus element) {
        String msg = String.format("姓名:%s,成绩:%s", element.getName(), element.getScore());
        System.out.println("ParentVistor --> visit" + msg);
    }
}
