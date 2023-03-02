package com.example.factorypattern.service.abstractfactory;

import com.example.factorypattern.domain.dto.Pizza;

/**
 * 按城市维度+产品线抽象
 */
public abstract class AbsProductFactory {
    public abstract Pizza createCheesePizza();
    public abstract Pizza createGreekPizza();
    public abstract Pizza createPepperPizza();
}