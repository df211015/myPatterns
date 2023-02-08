package com.example.builderpattern;

import com.example.builderpattern.service.buider03.MyDirector;
import com.example.builderpattern.service.buider03.SuperStar;
import com.example.builderpattern.service.simple.Director;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderpatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BuilderpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动成功!");

//		Computer computer = new Computer.Builder()
//				.buildCpu("cpu")
//				.buildRam("ram")
//				.buildUsb("usb")
//				.buildKeyboard("keyboard")
//				.build();
//
//		System.out.println(computer.getInfo());

//		SuperMan adultSuperMan = Director.getAdultSuperMan();
//		String specialTalent = adultSuperMan.getSpecialTalent();
//		System.out.println(String.format("超人信息:%s",specialTalent));

        MyDirector myDirector = new MyDirector();
//		MyBuilder myBuilder = new MyBuilder01();
//		myBuilder.setAge(18);
//		myBuilder.setName("aaa");
//		myBuilder.setFavourite("music");
//		SuperStar superStar = myDirector.getSuperStar(myBuilder);
//		System.out.println(String.format("superStar:%s", superStar.toString()));

//		SuperStar superStar = myDirector.getSuperStar();
//
//		String str = "";

        Director director = new Director();
        director.getProduct();

        String str = "";
    }
}
