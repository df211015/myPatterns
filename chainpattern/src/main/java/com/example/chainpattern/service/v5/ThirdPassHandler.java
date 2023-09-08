package com.example.chainpattern.service.v5;

public class ThirdPassHandler extends AbstractHandler {
    @Override
    public Integer play() {
        return 85;
    }

    @Override
    public Integer handler() {
        Integer score = this.play();
        if (score >= 95) {
            System.out.println("第三关开始...");
            if (null != this.getNext()) {
                return this.getNext().handler();
            }
        }
        return score;
    }
}
