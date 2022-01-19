package com.example.facadepattern.service.v2.service.impl;

public class InnerSystem {
    public void invokePerson() {
        ChineseImpl chinese = new ChineseImpl();
        chinese.name = "Jay";
        chinese.run();
    }
}
