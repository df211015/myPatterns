package com.example.factorypattern.service.v5;

import com.example.factorypattern.domain.dto.KeyPad;

import java.util.HashMap;
import java.util.Map;

public class KeyFactoryOfY extends AbsKeyFactory {
    private final Map<Integer, KeyPad> map;

    public KeyFactoryOfY() {
        this.map = new HashMap<>();
        this.map.put(1, KeyPad.builder().key("Y").description("").build());
        this.map.put(2, KeyPad.builder().key("U").description("").build());
        this.map.put(3, KeyPad.builder().key("I").description("").build());
        this.map.put(4, KeyPad.builder().key("O").description("").build());
        this.map.put(5, KeyPad.builder().key("P").description("").build());
    }

    @Override
    public KeyPad create(Integer index) {
        return this.map.get(index);
    }
}
