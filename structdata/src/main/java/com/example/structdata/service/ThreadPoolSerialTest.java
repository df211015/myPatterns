package com.example.structdata.service;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor对线程的执行顺序
 **/
public class ThreadPoolSerialTest {
    public static void main(String[] args) {
        //核心线程数
        int corePoolSize = 3;
        //最大线程数
        int maximumPoolSize = 6;
        //超过 corePoolSize 线程数量的线程最大空闲时间
        long keepAliveTime = 2;
        //以秒为时间单位
        TimeUnit unit = TimeUnit.SECONDS;
        //创建工作队列，用于存放提交的等待执行任务
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(2);
        ThreadPoolExecutor threadPoolExecutor = null;
        try {
            //创建线程池
            threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                    maximumPoolSize,
                    keepAliveTime,
                    unit,
                    workQueue,
                    new ThreadPoolExecutor.AbortPolicy());

            //循环提交任务
            for (int i = 0; i < 10008; i++) {
                //提交任务的索引
                final int index = (i + 1);
                threadPoolExecutor.submit(() -> {
                    //线程打印输出
                    String str = String.format("任务项:%s,线程:%s", index, Thread.currentThread().getName());
                    System.out.println(str);
                    try {
                        //模拟线程执行时间，10s
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                //每个任务提交后休眠500ms再提交下一个任务，用于保证提交顺序
                Thread.sleep(10);
            }
            threadPoolExecutor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}