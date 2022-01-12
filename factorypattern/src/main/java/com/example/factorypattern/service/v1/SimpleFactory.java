package com.example.factorypattern.service.v1;

import com.example.factorypattern.domain.constants.EShape;
import com.example.factorypattern.domain.dto.Circle;
import com.example.factorypattern.domain.dto.Rect;
import com.example.factorypattern.domain.dto.Shape;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public static Shape getShape(EShape shape) {
        if (EShape.circle.equals(shape)) {
            return new Circle();
        } else if (EShape.rect.equals(shape)) {
            return new Rect();
        }

        return null;
    }
}
