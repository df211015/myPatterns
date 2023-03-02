package com.example.factorypattern.service.factorymethod;

import com.example.factorypattern.domain.dto.CheesePizza;
import com.example.factorypattern.domain.dto.Pizza;

public class CheesePizzaFactory extends AbsPizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
