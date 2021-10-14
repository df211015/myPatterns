package com.example.structdata.service;

public class SyncTest implements Runnable {
    //共享资源变量
    static int count = 0;
    private byte[] mBytes = new byte[0];

    @Override
    public void run() {
        this.increaseCount();
        //假设省略了其他操作的代码
//        for (int i = 0; i < 20; i++) {
//            System.out.println(String.format("threadName:%s, count:%s", Thread.currentThread().getName(), count++));
//            try {
//                Thread.sleep(150L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    private synchronized static void increaseCount() {
        //假设省略了其他操作的代码
        for (int i = 0; i < 20; i++) {
            System.out.println(String.format("threadName:%s, count:%s", Thread.currentThread().getName(), count++));
            try {
                Thread.sleep(800L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncTest syncTest1 = new SyncTest();
        SyncTest syncTest2 = new SyncTest();
        Thread thread1 = new Thread(syncTest1, "thread1");
        Thread thread2 = new Thread(syncTest2, "thread2");
        thread1.start();
        thread2.start();
    }
}
