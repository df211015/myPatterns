package com.example.factorypattern;

import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.service.v3.AbsRankShapeFactory;
import com.example.factorypattern.service.v3.NormalShapeFactory;
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
//        AbsShapeFactory shapeFactory = new CircleFactory();
//        Shape shape = shapeFactory.createShape();

//        System.out.println(String.format("返回:%s", (null != shape) ? shape.getDescription() : "产品空"));

        /**
         * 抽象工厂模式
         */
        AbsRankShapeFactory shapeFactory = new NormalShapeFactory();
        Shape circle = shapeFactory.createCircle();
        Shape rect = shapeFactory.createRect();
        Shape triangle = shapeFactory.createTriangle();

        System.out.println(String.format("返回:%s", (null != circle) ? circle.getDescription() : "产品空"));
        System.out.println(String.format("返回:%s", (null != rect) ? rect.getDescription() : "产品空"));
        System.out.println(String.format("返回:%s", (null != triangle) ? triangle.getDescription() : "产品空"));
    }
}