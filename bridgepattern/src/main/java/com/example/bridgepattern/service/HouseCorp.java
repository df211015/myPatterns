package com.example.bridgepattern.service;

public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
