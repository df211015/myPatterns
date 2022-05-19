package com.example.specificationpattern;

import com.alibaba.fastjson.JSON;
import com.example.specificationpattern.domain.UserInfo;
import com.example.specificationpattern.service.ISpecification;
import com.example.specificationpattern.service.impl.biz.BizSpecificationOfEquals;
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

        List<UserInfo> list = new ArrayList<>();
        list.add(UserInfo.builder().userId("001").userName("张三").build());
        list.add(UserInfo.builder().userId("002").userName("李四").build());
        list.add(UserInfo.builder().userId("003").userName("王五").build());
        list.add(UserInfo.builder().userId("004").userName("钱六").build());

        ISpecification spec1 = new BizSpecificationOfEquals<UserInfo>("李四");
        list.forEach(r -> {
            if (spec1.isSatisfiedBy(r)) {
                System.out.println(String.format("输出对象:%s", JSON.toJSON(r)));
            }
        });

        //通用模式
//        ISpecification spec1 = new BizSpecification(new Object());
//        ISpecification spec2 = new BizSpecification(new Object());
//
//        for (Object obj : list) {
//            ISpecification andSpecification = spec1.and(spec2);
//            if (andSpecification.isSatisfiedBy(obj)) {
//                System.out.println(obj);
//            }
//        }
    }
}
