package com.example.factorypattern.service.abstractfactory;

import com.example.factorypattern.domain.dto.Pizza;

public abstract class AbsProductFactory {
    public abstract Pizza createCheesePizza();
    public abstract Pizza createGreekPizza();
    public abstract Pizza createPepperPizza();
}
