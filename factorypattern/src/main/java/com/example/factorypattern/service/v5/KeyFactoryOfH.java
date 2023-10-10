package com.example.factorypattern.service.v5;

import com.example.factorypattern.domain.dto.KeyPad;

import java.util.HashMap;
import java.util.Map;

public class KeyFactoryOfH extends AbsKeyFactory {

    private final Map<Integer, KeyPad> map;

    public KeyFactoryOfH() {
        this.map = new HashMap<>();
        this.map.put(1, KeyPad.builder().key("H").description("").build());
        this.map.put(2, KeyPad.builder().key("J").description("").build());
        this.map.put(3, KeyPad.builder().key("K").description("").build());
        this.map.put(4, KeyPad.builder().key("L").description("").build());
        this.map.put(5, KeyPad.builder().key("M").description("").build());
    }

    @Override
    public KeyPad create(Integer index) {
        return this.map.get(index);
    }
}
