package com.example.visitorpattern.service.customize;

public class HeadmasterVistor implements IVisitorPlus{
    @Override
    public void visit(ElementPlus element) {
        String msg = String.format("姓名:%s,等级:%s",element.getName(),element.getLevel());
        System.out.println("HeadmasterVistor --> visit" + msg);
    }
}
