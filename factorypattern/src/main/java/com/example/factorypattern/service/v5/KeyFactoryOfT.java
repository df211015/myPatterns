package com.example.factorypattern.service.v5;

import com.example.factorypattern.domain.dto.KeyPad;

import java.util.HashMap;
import java.util.Map;

public class KeyFactoryOfT extends AbsKeyFactory {
    private final Map<Integer, KeyPad> map;

    public KeyFactoryOfT() {
        this.map = new HashMap<>();
        this.map.put(1, KeyPad.builder().key("T").description("").build());
        this.map.put(2, KeyPad.builder().key("R").description("").build());
        this.map.put(3, KeyPad.builder().key("E").description("").build());
        this.map.put(4, KeyPad.builder().key("W").description("").build());
        this.map.put(5, KeyPad.builder().key("Q").description("").build());
    }

    @Override
    public KeyPad create(Integer index) {
        return this.map.get(index);
    }
}
