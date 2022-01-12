package com.example.factorypattern.service.v1;

import com.example.factorypattern.domain.constants.EShape;
import com.example.factorypattern.domain.dto.Circle;
import com.example.factorypattern.domain.dto.Rect;
import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.domain.dto.Triangle;

/**
 * 简单工厂模式
 */
public class SimpleShapeFactory {
    /**
     * 通过静态方式封装实例的产生过程
     *
     * @param shape
     * @return
     */
    public static Shape getShapeInstance(EShape shape) {
        Shape myShape = null;
        if (EShape.circle.equals(shape)) {
            myShape = new Circle();
        } else if (EShape.rect.equals(shape)) {
            myShape = new Rect();
        } else if (EShape.tri.equals(shape)) {
            myShape = new Triangle();
        }

        return null;
    }
}
