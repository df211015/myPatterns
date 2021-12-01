package com.example;

import com.example.service.superMan.AbsSkillPackage;
import com.example.service.superMan.DefenseSkill;
import com.example.service.superMan.FlySkill;
import com.example.service.superMan.NormalSkill;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class DecoratorpatternApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DecoratorpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//        SchoolReport sr = new FouthGradeSchoolReport();
//        sr= new HighScoreDecorator(sr);
//        sr = new SortDecorator(sr);
//        sr.report();
//        sr.sign("张三");

//        IStar freakStar = new FreakStar();
//        freakStar = new HotAir(freakStar);
//        freakStar = new Deny(freakStar);
//        System.out.println("===看一看虚假明星的形象===");
//        freakStar.act();

//        VirtualVehicle virtualVehicle = new ConcreteVirtualVehicle();
//        virtualVehicle = new VirtualVehiclePlusOfPrice(virtualVehicle, 10d, 20d, "234567890");
//        VehicleInfo vehicleInfo = virtualVehicle.generateVehicle("123456789");

//        Img img = new MyImg();
//        img = new ImgOfColor(img);
//        img.ImgDescription();
//
//        String str = "";

        AbsSkillPackage absSkillPackage = new NormalSkill();
        absSkillPackage = new FlySkill(absSkillPackage);
        absSkillPackage = new DefenseSkill(absSkillPackage);
        absSkillPackage.getSkillPackage();
    }
}
