package com.example.service.mysugar;

public class ColorSugar extends AbsSugarDecorator{
    public ColorSugar(ISweetFood sweetFood) {
        super(sweetFood);
    }

    @Override
    public String packageSugar(String name) {
        String s = super.packageSugar(name);
        String concat = s.concat(",给糖果追加红色包装纸!");
        System.out.println(concat);
        return concat;
    }
}
