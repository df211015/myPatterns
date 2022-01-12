package com.example.factorypattern;

import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.service.v2.AbsShapeFactory;
import com.example.factorypattern.service.v2.CircleFactory;
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
        /**
         * 简单工厂模式
         */
//        Shape shape = SimpleShapeFactory.getShapeInstance(EShape.circle);

        /**
         * 工厂模式(工厂方法模式)
         */
        AbsShapeFactory shapeFactory = new CircleFactory();
        Shape shape = shapeFactory.createShape();

        System.out.println(String.format("返回:%s", (null != shape) ? shape.getDescription() : "产品空"));
    }
}