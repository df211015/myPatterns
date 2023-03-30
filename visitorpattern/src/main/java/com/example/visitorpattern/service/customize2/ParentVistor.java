package com.example.visitorpattern.service.customize2;

public class ParentVistor implements IVisitorPlus {
    @Override
    public void visit(ElementPackager element) {
        ElementDto elementDto = element.getElementDto();
        String msg = String.format("姓名:%s,成绩:%s", elementDto.getName(), elementDto.getScore());
        System.out.println("ParentVistor --> visit" + msg);
    }
}
