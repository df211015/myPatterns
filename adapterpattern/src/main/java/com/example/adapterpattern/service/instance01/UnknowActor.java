package com.example.adapterpattern.service.instance01;

public class UnknowActor implements IActor {
    public void playact(String context) {
        System.out.println(String.format("普通演员：%s", context));
    }
}
