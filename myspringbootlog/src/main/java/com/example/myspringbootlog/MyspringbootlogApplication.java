package com.example.myspringbootlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MyspringbootlogApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootlogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动成功!");
        log.info("log.info");
        log.debug("log.debug");
        log.error("log.error");
    }
}
