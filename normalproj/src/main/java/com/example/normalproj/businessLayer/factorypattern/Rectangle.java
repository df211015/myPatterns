package com.example.normalproj.businessLayer.factorypattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("factorypattern,share->draw");
    }
}
