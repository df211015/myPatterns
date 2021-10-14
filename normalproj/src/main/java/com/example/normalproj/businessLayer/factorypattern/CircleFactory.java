package com.example.normalproj.businessLayer.factorypattern;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
