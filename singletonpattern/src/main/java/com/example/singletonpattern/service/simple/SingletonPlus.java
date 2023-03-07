package com.example.singletonpattern.service.simple;

public final class SingletonPlus {
    private static SingletonPlus singletonPlus;

    private SingletonPlus() {

    }

    public synchronized static SingletonPlus getSingletonPlus() {
        if (null == singletonPlus) {
            singletonPlus = new SingletonPlus();
        }

        return singletonPlus;
    }

    /**
     * 追加实例方法
     *
     * @return
     */
    public String getString() {
        return "test";
    }
}
