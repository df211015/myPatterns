package com.example.normalproj.businessLayer.abstractFactorypattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill red");
    }
}
