package com.example.service.mysugar;

public class FlavorSugar extends AbsSugarDecorator {
    public FlavorSugar(ISweetFood sweetFood) {
        super(sweetFood);
    }

    @Override
    public String packageSugar(String name) {
        String s = super.packageSugar(name);
        String concat = s.concat(",给糖果追加酸辣口感!");
        System.out.println(concat);
        return concat;
    }
}
