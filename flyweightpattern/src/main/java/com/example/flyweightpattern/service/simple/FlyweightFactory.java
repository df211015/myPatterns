package com.example.flyweightpattern.service.simple;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    /**
     * 享元工厂
     *
     * @param extrinsic 外部状态
     * @return
     */
    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic, flyweight);
        }

        return flyweight;
    }
}