package com.example.factorypattern.service.v2;

import com.example.factorypattern.domain.dto.Shape;

/**
 * 抽象工厂类
 */
public abstract class AbsShapeFactory {
    public abstract Shape createShape();
}
