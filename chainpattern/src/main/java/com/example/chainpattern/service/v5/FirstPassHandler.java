package com.example.chainpattern.service.v5;

public class FirstPassHandler extends AbstractHandler {
    @Override
    public Integer play() {
        return 80;
    }

    @Override
    public Integer handler() {
        Integer score = this.play();
        if (score >= 80) {
            System.out.println("第一关开始...");
            if (null != this.getNext()) {
                return this.getNext().handler();
            }
        }
        return score;
    }
}