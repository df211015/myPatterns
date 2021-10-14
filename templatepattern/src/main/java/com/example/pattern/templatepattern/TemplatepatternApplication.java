package com.example.pattern.templatepattern;

import com.example.pattern.templatepattern.service.ConcreteTemplate;
import com.example.pattern.templatepattern.service.Template;
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
        Template template = new ConcreteTemplate();
        template.process("子类的打印方法");
    }
}
