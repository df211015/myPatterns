package com.example.factorypattern.service.simple;

import com.example.factorypattern.domain.dto.CheesePizza;
import com.example.factorypattern.domain.dto.GreekPizza;
import com.example.factorypattern.domain.dto.PepperPizza;
import com.example.factorypattern.domain.dto.Pizza;

public class SimplePizzaFactory {

    /**
     * 简单工厂模式
     *
     * @param ordertype
     * @return
     */
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }

        return pizza;
    }
}