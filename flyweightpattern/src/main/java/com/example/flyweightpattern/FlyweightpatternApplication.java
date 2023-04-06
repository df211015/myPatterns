package com.example.flyweightpattern;

import com.example.flyweightpattern.service.customize.UnsharedConcreteFlyweight;
import com.example.flyweightpattern.service.customize.Flyweight;
import com.example.flyweightpattern.service.customize.FlyweightFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightpatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FlyweightpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动成功!");

//        FlyweightFactory factory = new FlyweightFactory();
//        Flyweight f01 = factory.getFlyweight("a");
//        Flyweight f02 = factory.getFlyweight("a");
//        Flyweight f03 = factory.getFlyweight("a");
//        Flyweight f11 = factory.getFlyweight("b");
//        Flyweight f12 = factory.getFlyweight("b");
//        f01.operation(new UnsharedConcreteFlyweight("第1次调用a"));
//        f02.operation(new UnsharedConcreteFlyweight("第2次调用a"));
//        f03.operation(new UnsharedConcreteFlyweight("第3次调用a"));
//        f11.operation(new UnsharedConcreteFlyweight("第1次调用b"));
//        f12.operation(new UnsharedConcreteFlyweight("第2次调用b"));

//        FlyweightFactory flyweightFactory = new FlyweightFactory();
//        //获取一个正常验证码
//        Captcha captcha = flyweightFactory.getCaptcha(0);
//        // 生成一个长宽为120且简单的正常验证码
//        captcha.product(new CaptchaArgs(120,120,"简单"));
//        //获取一个计算型验证码
//        captcha = flyweightFactory.getCaptcha(1);
//        // 生成一个长宽为200且复杂的计算型验证码
//        captcha.product(new CaptchaArgs(200,200,"复杂"));
        /**
         * 根据外部状态获取享元对像,示例聚集享元的处理,享元模式demo
         */
//        String extrinsic = "科目1考试地点1";
//        Flyweight flyweight = FlyweightFactory.getFlyweight(extrinsic);

        /**
         * 享元模式demo,该示例讲清楚了享元与非享元的关系
         * 该模式主要解决大对像的问题
         */
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a."));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a."));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a."));
    }
}
