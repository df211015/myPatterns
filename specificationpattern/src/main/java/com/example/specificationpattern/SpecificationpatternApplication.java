package com.example.specificationpattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpecificationpatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpecificationpatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动成功!");
    }
}
