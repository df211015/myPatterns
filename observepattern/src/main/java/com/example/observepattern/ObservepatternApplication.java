package com.example.observepattern;

import com.example.observepattern.service.customize.MyObserver1;
import com.example.observepattern.service.customize.MyObserver2;
import com.example.observepattern.service.customize.MySubject;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Observer;

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
//        ConcreteSubject subject = new ConcreteSubject();
//        Observer observer = new ConcreteObserver();
//        subject.addObserver(observer);
//        subject.doSomething();

        /**
         * 观察者模式
         */
        Observer observer1 = new MyObserver1();
        Observer observer2 = new MyObserver2();
        MySubject subject = new MySubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers("hello");
    }
}
