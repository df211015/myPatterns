package com.example.facadepattern.service.v2.service.impl;

import com.example.facadepattern.service.v2.service.IPersonService;

public class ChineseImpl implements IPersonService {
    public String name;

    public void run() {
        System.out.println("中国人走路");
    }

    @Override
    public void eat() {
        System.out.println("中国人吃饭");
    }
}
