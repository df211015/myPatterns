package com.example.flyweightpattern.service.instance01;

public class UnsharedConcreteFlyweight {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
}
