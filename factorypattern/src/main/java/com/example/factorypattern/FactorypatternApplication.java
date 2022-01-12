package com.example.factorypattern;

import com.example.factorypattern.domain.constants.EShape;
import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.service.v1.SimpleFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactorypatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FactorypatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Shape shape = SimpleFactory.getShape(EShape.circle);

        System.out.println(String.format("返回:%s", (null != shape) ? shape.getDescription() : "产品空"));
    }
}
