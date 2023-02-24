package com.example.strategypattern.service.simple;

public class Context {
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //具体策略选择
    private Strategy strategy;

    public void processOfStrategy() {
        if (null != this.strategy) {
            this.strategy.doSomething();
        }
    }
}
