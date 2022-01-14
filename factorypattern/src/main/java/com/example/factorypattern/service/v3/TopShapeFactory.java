package com.example.factorypattern.service.v3;

import com.example.factorypattern.domain.dto.Circle;
import com.example.factorypattern.domain.dto.Rect;
import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.domain.dto.Triangle;

public class TopShapeFactory extends AbsRankShapeFactory {
    @Override
    public Shape createCircle() {
        Shape shape = new Circle();
        shape.setRank("顶级");

        return shape;
    }

    @Override
    public Shape createRect() {
        Shape shape = new Rect();
        shape.setRank("顶级");

        return shape;
    }

    @Override
    public Shape createTriangle() {
        Shape shape = new Triangle();
        shape.setRank("顶级");

        return shape;
    }
}
