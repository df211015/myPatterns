package com.example.factorypattern.service.v4;

import com.example.factorypattern.domain.constants.ERank;
import com.example.factorypattern.service.v3.AbsRankShapeFactory;
import com.example.factorypattern.service.v3.NormalShapeFactory;
import com.example.factorypattern.service.v3.TopShapeFactory;

/**
 * 通过策略模式解藕客户端的调用
 */
public class StrategyContext {
    private ERank rank;
    private AbsRankShapeFactory shapeFactory;

    public StrategyContext(ERank rank) {
        this.rank = rank;
    }

    public AbsRankShapeFactory getFactory() {
        if (ERank.normal.equals(rank)) {
            return new NormalShapeFactory();
        } else if (ERank.top.equals(rank)) {
            return new TopShapeFactory();
        }

        return null;
    }
}
