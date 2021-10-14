package com.example.statepattern.service.AutowisedTest;

import org.springframework.stereotype.Service;

@Service
public class MyTest2 {
    private Integer var2 = 20;

    public String getMyVar2() {
        return String.format("%4d", this.var2);
    }
}
