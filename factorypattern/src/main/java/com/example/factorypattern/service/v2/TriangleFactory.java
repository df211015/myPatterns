package com.example.factorypattern.service.v2;

import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.domain.dto.Triangle;

public class TriangleFactory extends AbsShapeFactory {
    @Override
    public Shape createShape() {
        Shape shape = new Triangle();
        return shape;
    }
}
