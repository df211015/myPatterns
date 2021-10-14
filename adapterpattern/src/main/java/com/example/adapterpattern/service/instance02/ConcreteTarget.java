package com.example.adapterpattern.service.instance02;

import org.springframework.stereotype.Service;

@Service(value = "concreteTarget")
public class ConcreteTarget implements Target {
    @Override
    public void response(String unid) {
        System.out.println(String.format("ConcreteTarget,response,unid：%s", unid));
    }
}
