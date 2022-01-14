package com.example.factorypattern.service.v3;

import com.example.factorypattern.domain.dto.Circle;
import com.example.factorypattern.domain.dto.Rect;
import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.domain.dto.Triangle;

public class NormalShapeFactory extends AbsRankShapeFactory {

    @Override
    public Shape createCircle() {
        Shape shape = new Circle();

        return shape;
    }

    @Override
    public Shape createRect() {
        Shape shape = new Rect();

        return shape;
    }

    @Override
    public Shape createTriangle() {
        Shape shape = new Triangle();

        return shape;
    }
}
