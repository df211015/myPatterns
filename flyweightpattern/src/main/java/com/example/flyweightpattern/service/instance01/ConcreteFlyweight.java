package com.example.flyweightpattern.service.instance01;

public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println(String.format("享元key:%s,被创建", key));
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println(String.format("享元key:%s,被调用,非享元信息是:%s", this.key, state.getInfo()));
    }
}