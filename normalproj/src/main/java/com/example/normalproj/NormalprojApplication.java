package com.example.normalproj;

import com.example.normalproj.businessLayer.abstractFactorypattern.AbstractFactory;
import com.example.normalproj.businessLayer.abstractFactorypattern.FactoryProducer;
import com.example.normalproj.businessLayer.abstractFactorypattern.Shape;
import com.example.normalproj.businessLayer.factorypattern.CircleFactory;
import com.example.normalproj.businessLayer.factorypattern.ShapeFactory;
import com.example.normalproj.businessLayer.singletonpattern.SingletonInner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class NormalprojApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NormalprojApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("启动成功.....");

        //单例模式
        SingletonInner.getInstance().instanceMethod();

        //工厂方法模式
        ShapeFactory circleFactory = new CircleFactory();
        com.example.normalproj.businessLayer.factorypattern.Shape factorypattern_circle = circleFactory.createShape();
        factorypattern_circle.draw();

        //抽象工厂模式
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();
    }
}
