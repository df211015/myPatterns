package com.example.factorypattern.service.factorymethod;

import com.example.factorypattern.domain.dto.Pizza;

public abstract class AbsPizzaFactory {
    public abstract Pizza createPizza();
}
