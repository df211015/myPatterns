package com.example.builderpattern.service.buider03;

import lombok.Data;

/**
 * 构造者模式在于抽象创建的中间细节
 */
@Data
public abstract class MyBuilder {
    private String name;
    private Integer age;
    private String favourite;

    public MyBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public MyBuilder buildAge(Integer age) {
        this.age = age;
        return this;
    }

    public MyBuilder buildFavourite(String favourite) {
        this.favourite = favourite;
        return this;
    }

    public abstract SuperStar buildSuperStar();
}
