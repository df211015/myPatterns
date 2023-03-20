package com.example.flyweightpattern.service.customize;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = (Flyweight) this.flyweights.get(key);
        if (flyweight != null) {
            System.out.println(String.format("具体享元:%s,已经存在，被成功获取!", key));
        } else {
            flyweight = new ConcreteFlyweight(key);
            this.flyweights.put(key, flyweight);
        }

        return flyweight;
    }
}
