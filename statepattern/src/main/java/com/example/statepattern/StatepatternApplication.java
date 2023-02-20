package com.example.statepattern;

import com.example.statepattern.domain.EMyStatus;
import com.example.statepattern.service.AutowisedTest.MyTest;
import com.example.statepattern.service.normal.MyContext;
import com.example.statepattern.simple.ConcreteState1;
import com.example.statepattern.simple.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatepatternApplication implements CommandLineRunner {

    //	@Autowired
//	private TestService testService;
    @Autowired
    private MyTest myTest;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StatepatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//		System.out.println("电梯服务模拟开始...");
//		Context context = new Context();
//		context.setLiftState(new ClosingState());
//		context.open();
//		context.close();
//		context.run();
//		context.stop();

//		Map<String, Object> param = new HashMap<>();
//		List<String> items = new ArrayList<>();
//		for (int i = 0; i < 100000; i++) {
//			items.add(String.valueOf(i));
//		}
//		param.put("unids", items);
//		param.put("frequency", 4);
//		param.put("sleepTime", 1);
//		this.testService.threadTest(param);

//		Context context = new Context();
//		context.setCurrentWorkStatus(new ChildWorkStatus());
//		context.work();
//		context.work();
//		context.work();

//		Context context = new Context();
//		context.setCurrentStatus(new SolidStatus());
//		context.statusProcess();
//		context.statusProcess();
//		context.statusProcess();

//		String myTest = this.myTest.getMyTest();
//		String str = "";

//		MyContext context = new MyContext();
//		context.seteMyStatus(EMyStatus.STATUS_001);
//		context.operate();
//		context.operate();
//		context.operate();

        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        //行为执行
        context.handle1();
        //状态转换
        context.handle2();
    }
}
