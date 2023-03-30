package com.example.visitorpattern;

import com.example.visitorpattern.service.customize2.*;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorpatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(VisitorpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动成功");

//		List<Employee> empList = new ArrayList<Employee>();
//		//产生张三这个员工
//		CommonEmployee zhangSan = new CommonEmployee();
//		zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
//		zhangSan.setName("张三");
//		zhangSan.setSalary(1800);
//		zhangSan.setSex(Employee.MALE);
//		empList.add(zhangSan);
//
//		//产生李四这个员工
//		CommonEmployee liSi = new CommonEmployee();
//		liSi.setJob("页面美工，审美素质太不流行了！");
//		liSi.setName("李四");
//		liSi.setSalary(1900);
//		liSi.setSex(Employee.FEMALE);
//		empList.add(liSi);
//
//		//再产生一个经理
//		Manager wangWu = new Manager();
//		wangWu.setName("王五");
//		wangWu.setPerformance("基本上是负值，但是我会拍MP呀");
//		wangWu.setSalary(18750);
//		wangWu.setSex(Employee.MALE);
//		empList.add(wangWu);
//
//		for(Employee emp:empList){
//			emp.accept(new Visitor());
//		}

//        Animal cat = new Cat("jimy", "cry", "it is a lovely cat!");
//        IVisitor visitor = new LocalVisitor();
//        cat.visit(visitor);

        //元素访问者
//        for (int i = 0; i < 10; i++) {
//            Element el = ObjectStruture.createElement();
//            el.accept(new Visitor());
//        }

        /**
         * 访问者模式,以被访问的元素作为基础,accept方法在元素内部;如果没有accept方法则
         * 直接演变成了策略模式
         */
//        ElementPlus element1 = new ElementPlus();
//        element1.setName("aaa");
//        element1.setLevel("一级");
//        element1.setScore(90d);
//        //访问者1
//        IVisitorPlus visitor1 = new HeadmasterVistor();
//        //访问者2
//        IVisitorPlus visitor2 = new ParentVistor();
//        element1.accept(visitor1);

        /**
         * 访问者模式,通过追加一个包装器类,将dto独立出来,在实际业务中更有发挥的空间
         */
        ElementDto element = new ElementDto();
        element.setName("aaa");
        element.setLevel("一级");
        element.setScore(90d);
        ElementPackager elementPackager = new ElementPackager();
        elementPackager.setElementDto(element);
        //访问者1
        IVisitorPlus visitor1 = new HeadmasterVistor();
        //访问者2
        IVisitorPlus visitor2 = new ParentVistor();
        elementPackager.accept(visitor2);
    }
}
