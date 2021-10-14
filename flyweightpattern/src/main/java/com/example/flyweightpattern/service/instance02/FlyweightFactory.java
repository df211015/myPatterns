package com.example.flyweightpattern.service.instance02;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory  {
    private static Map<String, IFlyweight> pool = new HashMap<>();

    // 因为内部状态具备不变性，因此作为缓存的键
    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
