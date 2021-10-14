package com.example.statepattern.service.AutowisedTest;

import org.springframework.stereotype.Service;

@Service
public class MyTest1 {
    private Integer var1 = 10;

    public String getMyVar1() {
        return String.format("%4d", this.var1);
    }
}
