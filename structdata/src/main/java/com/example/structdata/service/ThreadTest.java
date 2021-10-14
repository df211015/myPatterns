package com.example.structdata.service;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println(String.format("开始子线程任务,名称:%s", Thread.currentThread().getName()));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 110; i++) {
            System.out.println(String.format("主线程执行:%s", i));

            Thread.sleep(50L);
        }

        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(threadTest, "线程1");
        Thread thread2 = new Thread(threadTest, "线程2");
        thread1.start();
        thread2.start();
        thread1.join();
    }
}
