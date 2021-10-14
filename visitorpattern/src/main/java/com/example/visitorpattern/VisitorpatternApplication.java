package com.example.visitorpattern;

import com.example.visitorpattern.service.CommonEmployee;
import com.example.visitorpattern.service.Employee;
import com.example.visitorpattern.service.Manager;
import com.example.visitorpattern.service.Visitor;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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

		List<Employee> empList = new ArrayList<Employee>();
		//产生张三这个员工
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
		zhangSan.setName("张三");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);

		//产生李四这个员工
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("页面美工，审美素质太不流行了！");
		liSi.setName("李四");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		empList.add(liSi);

		//再产生一个经理
		Manager wangWu = new Manager();
		wangWu.setName("王五");
		wangWu.setPerformance("基本上是负值，但是我会拍MP呀");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		empList.add(wangWu);

		for(Employee emp:empList){
			emp.accept(new Visitor());
		}
	}
}
