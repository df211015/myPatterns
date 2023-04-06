package com.example.commandpattern.commandpattern.customize;

import java.util.Random;

public class ConcreteLiftReceiver extends AbsLiftReceiver {
    @Override
    public void selectLift() {
        Random random = new Random();
        int index = random.nextInt(3);
        System.out.println(String.format("已为您选择第%s部电梯,欢迎乘坐", index + 1));
    }
}