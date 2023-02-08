package com.example.builderpattern.service.simple;

public class ConcreteProduct extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        System.out.println("ConcreteProduct -> setPart,好好设计位置!");
    }

    @Override
    public Product buildProduct() {
        return this.product;
    }
}
