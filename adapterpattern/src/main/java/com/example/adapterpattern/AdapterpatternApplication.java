package com.example.adapterpattern;

import com.example.adapterpattern.service.simple.Adapter;
import com.example.adapterpattern.service.simple.ConcreteTarget;
import com.example.adapterpattern.service.simple.Target;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterpatternApplication implements CommandLineRunner {

//    @Autowired
//    private Adapter adapter;
//
//    @Autowired
//    @Qualifier(value = "concreteTarget")
//    private Target concreteTarget;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AdapterpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    public void run(String... args) throws Exception {
//        System.out.println("===演戏过程模拟===");
//        IStar star = new FilmStar();
//        star.act("前十五分钟,明星本人演戏");
//        IActor actor = new UnknowActor();
//        IStar standin = new Standin(actor);
//        standin.act("中间五分钟,替身在演戏");
//        star.act("后十五分钟,明星本人在演戏");

//        this.adapter.setType(100);
//        Target myTarget = (Target) this.adapter;
//        myTarget.response("1001");
//        this.concreteTarget.response("1002");
//
//        String str = "";

        /**
         * 适配器模式demo示例
         */
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        //增加了适配器角色后的处理
        Target target2 = new Adapter();
        target2.request();
    }
}
