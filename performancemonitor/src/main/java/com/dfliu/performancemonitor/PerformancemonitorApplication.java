package com.dfliu.performancemonitor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerformancemonitorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PerformancemonitorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("programmer started！");
    }
}
