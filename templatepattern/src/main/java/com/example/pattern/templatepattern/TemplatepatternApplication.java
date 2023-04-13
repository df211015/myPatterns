package com.example.pattern.templatepattern;

import com.example.pattern.templatepattern.service.customize.ConcreteTemplate;
import com.example.pattern.templatepattern.service.customize.TemplatePlus;
import com.example.pattern.templatepattern.service.simple.HummerH1Model;
import com.example.pattern.templatepattern.service.v1.Template;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplatepatternApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(TemplatepatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Template template = new ConcreteTemplate();
//        template.process("子类的打印方法");

        /**
         * 模板方法模式demo,勾子函数下是类似这样的套路
         */
//        HummerH1Model h1 = new HummerH1Model();
//        h1.setAlarm(false);
//        h1.run();

        /**
         * 模板方法模式
         * 和工厂方法模式类似,工厂方法侧重创建对像,模板方法侧重在交互过程
         */
        TemplatePlus templatePlus = new ConcreteTemplate();
        templatePlus.op();
    }
}
