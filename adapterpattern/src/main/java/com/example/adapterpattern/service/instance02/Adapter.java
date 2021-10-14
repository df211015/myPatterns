package com.example.adapterpattern.service.instance02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "adapter")
public class Adapter implements Target {
    @Autowired
    private Adaptee adaptee;

    private Integer type;

    public void setType(Integer type){
        this.type = type;
    }

    @Override
    public void response(String unid) {
        this.adaptee.response_adaptee(unid, type);
    }
}
