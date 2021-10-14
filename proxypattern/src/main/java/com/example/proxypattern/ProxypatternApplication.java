package com.example.proxypattern;

import com.example.proxypattern.service.GamePlayIH;
import com.example.proxypattern.service.GamePlayer;
import com.example.proxypattern.service.IGamePlayer;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@SpringBootApplication
public class ProxypatternApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ProxypatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//		IGamePlayer gamePlayer = new GamePlayer("玩家1");
//		IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
//		//开始打游戏，记下时间戳
//		System.out.println("开始时间是：2009-8-25 10:45");
//		proxy.login("zhangSan", "password");
//		//开始杀怪
//		proxy.killBoss();
//		//升级
//		proxy.upgrade();
//		//记录结束游戏时间
//		System.out.println("结束时间是：2009-8-26 03:40");

//        IGamePlayer proxy = new GamePlayerProxy("张三");
//        //开始打游戏，记下时间戳
//        System.out.println("开始时间是：2009-8-25 10:45");
//        proxy.login("zhangSan", "password");
//        //开始杀怪
//        proxy.killBoss();
//        //升级
//        proxy.upgrade();
//        //记录结束游戏时间
//        System.out.println("结束时间是：2009-8-26 03:40");

//        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = player.getProxy();
//        //开始打游戏，记下时间戳
//        System.out.println("开始时间是：2009-8-25 10:45");
//        proxy.login("zhangSan", "password");
//        //开始杀怪
//        proxy.killBoss();
//        //升级
//        proxy.upgrade();
//        //记录结束游戏时间
//        System.out.println("结束时间是：2009-8-26 03:40");

        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        ClassLoader c1 = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(c1, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
