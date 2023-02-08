package com.example.builderpattern.service.simple;

public class Director {
    private Builder builder = new ConcreteProduct();

    /**
     * 设置完构建产品的中间过程
     *
     * @return
     */
    public Product getProduct() {
        this.builder.setPart();
        Product product = this.builder.buildProduct();
        return product;
    }
}
