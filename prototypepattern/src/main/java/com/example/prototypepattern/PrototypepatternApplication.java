package com.example.prototypepattern;

import com.example.prototypepattern.servrice.instance02.ConcretePrototype;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypepatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(PrototypepatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Thing thing = new Thing();
//        thing.setList("test1");
//        List myLst1 = thing.getArrayList();
//
//        Thing thing2 = thing.clone();
//        thing2.setList("test2");
//        List myLst2 = thing.getArrayList();
//        List myLst3 = thing2.getArrayList();
//        String str = "";

        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
