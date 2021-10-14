package com.taoche.example.redisdemo.config.config02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public void myBean() {
        System.out.println("MyConfig->myBean被执行");
    }

    @Bean
    public void myBean2() {
        System.out.println("MyConfig->myBean2被执行");
    }
}
