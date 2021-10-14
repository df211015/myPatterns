package com.example.builderpattern.service.buider03;

import lombok.Data;

@Data
public class MyBuilder01 extends MyBuilder {

    @Override
    public SuperStar buildSuperStar() {
        return new SuperStar(this);
    }
}
