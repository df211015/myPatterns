package com.example.normalproj.businessLayer.abstractFactorypattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
