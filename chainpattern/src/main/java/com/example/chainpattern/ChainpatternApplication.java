package com.example.chainpattern;

import com.example.chainpattern.service.v1.*;
import com.example.chainpattern.service.v3.ConcreteProcessor1;
import com.example.chainpattern.service.v3.ConcreteProcessor2;
import com.example.chainpattern.service.v3.ConcreteProcessor3;
import com.example.chainpattern.service.v3.Processor;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
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

//        Random random = new Random();
//        ArrayList<IWomen> arrayList = new ArrayList<>();
//        for (int i = 0; i < 1; i++) {
//            IWomen women = new Women(random.nextInt(3) + 1, "我要去逛街");
//            arrayList.add(women);
//            System.out.println(String.format("打印第%s条记录信息:%s", i, com.alibaba.fastjson.JSON.toJSONString(women)));
//        }
//
//        Handler father = new Father();
//        Handler husband = new Husband();
//        Handler son = new Son();
//        father.setNextHandler(husband);
//        husband.setNextHandler(son);
//        for (IWomen iWomen : arrayList) {
//            father.HandleMessage(iWomen);
//        }

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

        /**
         * 触发链的设计思想和职责链的区别在于,链上的消息体是否可变,触发链的消息体仅适用链的上下级
         */
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
//        Handler handler1 = new ConcreteHandler1();
//        Handler handler2 = new ConcreteHandler2();
//        Handler handler3 = new ConcreteHandler3();
//        handler1.setNext(handler2);
//        handler2.setNext(handler3);
//        //提交请求,返回处理结果
//        int iLevel = new Random().nextInt(3) + 1;
//        Request request = new Request(iLevel);
//        Response response = handler1.handlerMessage(request);
//        System.out.println(String.format("职责链处理结果:%s", JSON.toJSONString(response)));

        /**
         * 职责链,仅对链上满足条件的第一个节点进行处理,后续节点即便满足也不会执行
         * 如果要全节点执行,可以选择状态模式
         */
//        Handler handlerOfOne = new HandlerOfOne();
//        Handler handlerOfTwo = new HandlerOfTwo();
//        Handler handlerOfThree = new HandlerOfThree();
//        handlerOfOne.setNextHandler(handlerOfTwo);
//        handlerOfTwo.setNextHandler(handlerOfThree);
//        handlerOfOne.process();


//        List<Processor> processors = new ArrayList<>();
//        processors.add(new ConcreteProcessor1());
//        processors.add(new ConcreteProcessor2());
//        processors.add(new ConcreteProcessor3());
//        // 设置每个处理器的后继处理器
//        for (int i = 0; i < processors.size() - 1; i++) {
//            processors.get(i).setSuccessor(processors.get(i+1));
//        }

        /**
         * 职责链处理方式,把处理类下放到子类进行实现,依然没有解决调用递归的问题
         */
        Processor processor1 = new ConcreteProcessor1();
        Processor processor2 = new ConcreteProcessor2();
        Processor processor3 = new ConcreteProcessor3();
        processor1.setSuccessor(processor2);
        processor2.setSuccessor(processor3);
        // 处理请求
        Integer result = processor1.process(3);
    }
}
