package com.example.builderpattern.service.buider03;

public class MyBuilder02 extends MyBuilder {
    @Override
    public SuperStar buildSuperStar() {
        return new SuperStar(this);
    }
}
