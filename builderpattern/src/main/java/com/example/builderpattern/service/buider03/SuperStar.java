package com.example.builderpattern.service.buider03;

public class SuperStar {
    private String name;
    private Integer age;
    private String favourite;

    public SuperStar(MyBuilder myBuilder) {
        this.name = myBuilder.getName();
        this.age = myBuilder.getAge();
        this.favourite = myBuilder.getFavourite();
    }
}
