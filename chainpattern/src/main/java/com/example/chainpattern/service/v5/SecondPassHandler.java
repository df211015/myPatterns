package com.example.chainpattern.service.v5;

public class SecondPassHandler extends AbstractHandler {
    @Override
    public Integer play() {
        return 90;
    }

    @Override
    public Integer handler() {
        Integer score = this.play();
        if (score >= 90) {
            System.out.println("第二关开始...");
            if (null != this.getNext()) {
                return this.getNext().handler();
            }
        }
        return score;
    }
}
