package com.example.chainpattern;

import com.alibaba.fastjson.JSON;
import com.example.chainpattern.domain.ApplyInfo;
import com.example.chainpattern.service.simple.*;
import com.example.chainpattern.service.v2.ApplyHandler;
import com.example.chainpattern.service.v2.ProjectLeader;
import com.example.chainpattern.service.v2.ProjectManager;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Random;

@SpringBootApplication
public class ChainpatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ChainpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("模拟开始...");
//		Random random = new Random();
//		ArrayList<IWomen> arrayList = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			IWomen women = new Women(random.nextInt(3) + 1, "我要去逛街");
//			arrayList.add(women);
//			System.out.println(String.format("打印第%s条记录信息:%s", i, JSON.toJSONString(women)));
//		}
//
//		Handler father = new Father();
//		Handler husband = new Husband();
//		Handler son = new Son();
//		father.setNextHandler(husband);
//		husband.setNextHandler(son);
//		for (IWomen iWomen : arrayList) {
//			father.HandleMessage(iWomen);
//		}

//        System.out.println("模拟开始....");
//        DnsParse dnsOfShanghai = new DnsOfShanghai();
//        DnsParse dnsOfChina = new DnsOfChina();
//        DnsParse dnsOfTop = new DnsOfTop();
//        dnsOfShanghai.setNextDnsParse(dnsOfChina);
//        dnsOfChina.setNextDnsParse(dnsOfTop);
//        RequestDns requestDns = new RequestDns(DnsParse.DNS_PARSE_SHANGHAI, "上海用户,请求域名解析");
//        requestDns.printRequestMsg();
//        dnsOfShanghai.parse(requestDns);

//        DnsServer sh = new SHDnsServer();
//        DnsServer china = new ChinaTopDnsServer();
//        DnsServer top = new TopDnsServer();
//        sh.setUpperServer(china);
//        china.setUpperServer(top);
//        System.out.println("===域名解析模拟器===");
//        while (true){
//            System.out.println("\n请输入域名(输入N退出):");
//            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//            if(domain.equalsIgnoreCase("n")){
//                return;
//            }
//            Recorder recorder = sh.resolve(domain);
//            System.out.println("---DNS服务器解析结果---");
//            System.out.println(recorder);
//        }

//        DnsServer sh = new SHDnsServer();
//        DnsServer china = new ChinaTopDnsServer();
//        DnsServer top = new TopDnsServer();
//        sh.setUpperServer(china);
//        china.setUpperServer(top);
//        System.out.println("===域名解析模拟器===");
//        while (true) {
//            System.out.println("\n请输入域名(输入N退出):");
//            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
//            if (domain.equalsIgnoreCase("n")) {
//                return;
//            }
//            Recorder recorder = new Recorder();
//            recorder.setDomain(domain);
//            sh.update(null, recorder);
//            System.out.println("---DNS服务器解析结果---");
//            System.out.println(recorder);
//        }

//        ApplyInfo applyInfo = ApplyInfo.builder().vacationDays(7).remark("申请假期处理").build();
//        ApplyHandler projectManager = new ProjectManager(applyInfo);
//        ApplyHandler projectLeader = new ProjectLeader(applyInfo);
//        projectManager.setNextHandler(projectLeader);
//        projectManager.handler();


        //声明出所有的处理节点,以链式进行调用
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求,返回处理结果
        int iLevel = new Random().nextInt(4) + 1;
        Request request = new Request(iLevel);
        Response response = handler1.handlerMessage(request);
        System.out.println(String.format("职责链处理结果:%s", JSON.toJSONString(response)));
    }
}
