package com.example.flyweightpattern.service.customize;

public class ConcreteFlyweight implements Flyweight {
    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println(String.format("具体享元:%s,被创建！", key));
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println(String.format("具体享元:%s,被调用,非享元信息是:%s", this.key, outState.getInfo()));
    }
}
