package com.example.demo100.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MyIndex {
    @GetMapping(value = "/testGetCar")
    public String test() {
        return "ok";
    }
}
