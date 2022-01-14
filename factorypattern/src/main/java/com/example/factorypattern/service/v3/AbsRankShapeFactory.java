package com.example.factorypattern.service.v3;

import com.example.factorypattern.domain.dto.Shape;

public abstract class AbsRankShapeFactory {
    /**
     *
     * @return
     */
    public abstract Shape createCircle();

    /**
     *
     * @return
     */
    public abstract Shape createRect();

    /**
     * 
     * @return
     */
    public abstract Shape createTriangle();
}
