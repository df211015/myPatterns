package com.example.observepattern;

import com.example.observepattern.service.lottery.LotteryServiceImpl;
import com.example.observepattern.service.simple.ConcreteObserver;
import com.example.observepattern.service.simple.ConcreteSubject;
import com.example.observepattern.service.simple.Observer;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObservepatternApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ObservepatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//		Observer lishi = new Lisi();
//		Observer wangsi = new Wangsi();
//
//		Hanfeizi hanfeizi = new Hanfeizi();
//		hanfeizi.addObserver(lishi);
//		hanfeizi.addObserver(wangsi);
//		hanfeizi.doSomething();
//
//		Observer studentA = new StudentA();
//		Observer studentB = new StudentB();
//		Observer studentC = new StudentC();
//
//		MyRing myRing = new MyRing();
//		myRing.addObserver(studentA);
//		myRing.addObserver(studentB);
//		myRing.addObserver(studentC);
//
//		StudentA studentA1 = (StudentA)studentA;
//		studentA1.addObserver(studentB);
//		studentA1.addObserver(studentC);
//		studentA1.doSomething();
//
//		myRing.playRing();

//        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
//        lotteryService.draw("87574");

        /**
         * 观察者模式demo
         */
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
