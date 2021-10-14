package com.example.hutoolmytest.service.impl;

import cn.hutool.core.lang.Console;
import com.example.hutoolmytest.service.Animal;

public class Cat implements Animal {

    @Override
    public void eat(String name) {
        Console.log(String.format("cat_name:%s", name));
    }
}