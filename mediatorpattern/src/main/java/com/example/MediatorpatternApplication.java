package com.example;

import com.example.service.pk2.*;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorpatternApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MediatorpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//        AbstractMediator mediator = new Mediator();
//        System.out.println("---采购人员采购电脑---");
//        Purchase purchase = new Purchase(mediator);
//        purchase.buyIBMcomputer(100);
//        System.out.println("---销售人员销售电脑---");
//        Sale sale = new Sale(mediator);
//        sale.sellIBMComputer(1);
//        System.out.println("---库房管理人员清库处理---");
//        Stock stock = new Stock(mediator);
//        stock.clearStock();

//        Mediator md = new ConcreteMediator();
//        Colleague c1 = new ConcreteColleague1();
//        Colleague c2 = new ConcreteColleague2();
//        md.register(c1);
//        md.register(c2);
//        c1.send();
//        c2.send();

        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Nice to meet u.");
        colleague2.send("Nice to meet u too.");
    }
}