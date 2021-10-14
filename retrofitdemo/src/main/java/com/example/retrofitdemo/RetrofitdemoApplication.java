package com.example.retrofitdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetrofitdemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RetrofitdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动成功......");
    }
}
