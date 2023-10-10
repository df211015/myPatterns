package com.example.factorypattern;

import com.example.factorypattern.domain.constants.ERank;
import com.example.factorypattern.domain.dto.KeyPad;
import com.example.factorypattern.domain.dto.Shape;
import com.example.factorypattern.service.v3.AbsRankShapeFactory;
import com.example.factorypattern.service.v4.StrategyContext;
import com.example.factorypattern.service.v5.AbsKeyFactory;
import com.example.factorypattern.service.v5.KeyFactoryOfG;
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
//        AbsRankShapeFactory shapeFactory = new NormalShapeFactory();
//        Shape circle = shapeFactory.createCircle();
//        Shape rect = shapeFactory.createRect();
//        Shape triangle = shapeFactory.createTriangle();

        /**
         * 策略模式+抽象工厂模式组合
         * 通过在客户端给不同的枚举，返回不同的工厂类，包装了客户的创建特定工厂类的过程
         */
//        StrategyContext strategyContext = new StrategyContext(ERank.normal);
//        AbsRankShapeFactory factory = strategyContext.getFactory();
//        Shape circle = factory.createCircle();
//        Shape rect = factory.createRect();
//        Shape triangle = factory.createTriangle();
//
//        System.out.println(String.format("返回:%s", (null != circle) ? circle.getDescription() : "产品空"));
//        System.out.println(String.format("返回:%s", (null != rect) ? rect.getDescription() : "产品空"));
//        System.out.println(String.format("返回:%s", (null != triangle) ? triangle.getDescription() : "产品空"));

        /**
         * 工厂方法模式
         */
        AbsKeyFactory keyFactoryOfG = new KeyFactoryOfG();
        KeyPad keyPad = keyFactoryOfG.create(4);
        System.out.println(String.format("keypad:%s", null != keyPad ? keyPad.getKey() : "空"));
        String str = "";
    }
}