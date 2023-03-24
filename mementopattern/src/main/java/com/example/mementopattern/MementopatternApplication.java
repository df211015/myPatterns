package com.example.mementopattern;

import com.example.mementopattern.service.simple.Caretaker;
import com.example.mementopattern.service.simple.Memento;
import com.example.mementopattern.service.simple.Originator;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementopatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MementopatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动成功");

//		Originator originator = new Originator();
//		Caretaker caretaker = new Caretaker();
//		caretaker.setMemento(originator.createMemento());
//		originator.restoreMemento(caretaker.getMemento());

        /**
         * 备忘录模式demo
         * 涉及角色:发起人(Originator)角色、备忘录(Memento)角色、负责人(Caretaker)角色
         */
        //发起人角色进行数据变更
        Originator originatorPlus = new Originator();
        originatorPlus.setData("第一次初始化");
        Memento mementoFirst = originatorPlus.createMemento();
        //负责人角色进行备忘录管理
        Caretaker caretakerPlus = new Caretaker();
        caretakerPlus.addMemento(mementoFirst);
        //负责人角色选择备忘录
        Memento lastMemento = caretakerPlus.getLastMemento();
        originatorPlus.recover(lastMemento);
    }
}
