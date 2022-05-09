package com.example.service.mySpringframework;

public class HelloComponentImpl implements HelloComponent {
    @Override
    public String hello() {
        String str = "hello";
        System.out.println(String.format("-->HelloComponentImpl：%s", str));
        return str;
    }
}
