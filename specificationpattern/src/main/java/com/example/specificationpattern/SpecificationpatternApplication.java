package com.example.specificationpattern;

import com.example.specificationpattern.service.ISpecification;
import com.example.specificationpattern.service.impl.BizSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpecificationpatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpecificationpatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动成功!");

        List<Object> list = new ArrayList<>();

        ISpecification spec1 = new BizSpecification(new Object());
        ISpecification spec2 = new BizSpecification(new Object());

        for (Object obj : list) {
            if (spec1.and(spec2).isSatisfiedBy(obj)) {
                System.out.println(obj);
            }
        }
    }
}
