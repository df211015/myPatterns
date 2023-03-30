package com.example.visitorpattern.service.customize2;

public class HeadmasterVistor implements IVisitorPlus {
    @Override
    public void visit(ElementPackager element) {
        ElementDto elementDto = element.getElementDto();
        String msg = String.format("姓名:%s,等级:%s", elementDto.getName(), elementDto.getLevel());
        System.out.println("HeadmasterVistor --> visit" + msg);
    }
}
