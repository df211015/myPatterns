package com.example.factorypattern.service.v5;

import com.example.factorypattern.domain.dto.KeyPad;

import java.util.HashMap;
import java.util.Map;

public class KeyFactoryOfG extends AbsKeyFactory {

    private final Map<Integer, KeyPad> map;

    public KeyFactoryOfG() {
        this.map = new HashMap<>();
        this.map.put(1, KeyPad.builder().key("G").description("").build());
        this.map.put(2, KeyPad.builder().key("F").description("").build());
        this.map.put(3, KeyPad.builder().key("D").description("").build());
        this.map.put(4, KeyPad.builder().key("S").description("").build());
        this.map.put(5, KeyPad.builder().key("A").description("").build());
    }

    @Override
    public KeyPad create(Integer index) {
        return this.map.get(index);
    }
}
