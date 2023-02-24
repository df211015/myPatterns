package com.example.strategypattern.service.v1;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后,拦住追兵");
    }
}
