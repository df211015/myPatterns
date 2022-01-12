package com.example.factorypattern.service.v2;

import com.example.factorypattern.domain.dto.Rect;
import com.example.factorypattern.domain.dto.Shape;

public class RectFactory extends AbsShapeFactory {

    @Override
    public Shape createShape() {
        Shape shape = new Rect();
        return shape;
    }
}
