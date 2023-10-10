package com.example.factorypattern.service.v5;

import com.example.factorypattern.domain.dto.KeyPad;

import java.util.HashMap;
import java.util.Map;

public class KeyFactoryOfN extends AbsKeyFactory {
    private final Map<Integer, KeyPad> map;

    public KeyFactoryOfN() {
        this.map = new HashMap<>();
        this.map.put(1, KeyPad.builder().key("N").description("").build());
        this.map.put(2, KeyPad.builder().key("B").description("").build());
        this.map.put(3, KeyPad.builder().key("V").description("").build());
        this.map.put(4, KeyPad.builder().key("C").description("").build());
        this.map.put(5, KeyPad.builder().key("X").description("").build());
    }

    @Override
    public KeyPad create(Integer index) {
        return this.map.get(index);
    }
}