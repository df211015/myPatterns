package com.example.service.mysugar;

public class AbsSugarDecorator implements ISweetFood {
    private ISweetFood sweetFood;

    public AbsSugarDecorator(ISweetFood sweetFood) {
        this.sweetFood = sweetFood;
    }

    @Override
    public String packageSugar(String name) {
        return this.sweetFood.packageSugar(name);
    }
}
