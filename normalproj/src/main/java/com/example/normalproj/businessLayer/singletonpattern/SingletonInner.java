package com.example.normalproj.businessLayer.singletonpattern;

/**
 * 内部类方式实现单例模式
 */
public class SingletonInner {
    /**
     * 内部类实现单例模式
     */
    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    /**
     * 构造函数
     */
    private SingletonInner() {
    }

    /**
     * @return
     */
    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 实例方法
     */
    public void instanceMethod() {
        System.out.println("单例模式实例方法调用,singletonInner");
    }
}
