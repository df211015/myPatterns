package com.example.flyweightpattern.service.instance01;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> map = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = this.map.get(key);
        if (flyweight != null) {
            System.out.println(String.format("享元key:%s,已存在,对像已获取", key));
        } else {
            flyweight = new ConcreteFlyweight(key);
            this.map.put(key, flyweight);
        }

        return flyweight;
    }
}