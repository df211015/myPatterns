package com.example.factorypattern.service.v2;

import com.example.factorypattern.domain.dto.Circle;
import com.example.factorypattern.domain.dto.Shape;

public class CircleFactory extends AbsShapeFactory {
    @Override
    public Shape createShape() {
        Shape shape = new Circle();
        return shape;
    }
}
