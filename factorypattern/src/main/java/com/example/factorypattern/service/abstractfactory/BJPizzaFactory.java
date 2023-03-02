package com.example.factorypattern.service.abstractfactory;

import com.example.factorypattern.domain.dto.CheesePizza;
import com.example.factorypattern.domain.dto.GreekPizza;
import com.example.factorypattern.domain.dto.PepperPizza;
import com.example.factorypattern.domain.dto.Pizza;

/**
 * 按城市维度+产品线抽象
 */
public class BJPizzaFactory extends AbsProductFactory{
    @Override
    public Pizza createCheesePizza() {
        return new CheesePizza();
    }

    @Override
    public Pizza createGreekPizza() {
        return new GreekPizza();
    }

    @Override
    public Pizza createPepperPizza() {
        return new PepperPizza();
    }
}
