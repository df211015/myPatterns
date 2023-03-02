package com.example.factorypattern.service.factorymethod;

import com.example.factorypattern.domain.dto.PepperPizza;
import com.example.factorypattern.domain.dto.Pizza;

public class PepperPizzaFactory extends AbsPizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PepperPizza();
    }
}
