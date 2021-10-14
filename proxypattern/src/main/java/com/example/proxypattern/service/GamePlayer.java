package com.example.proxypattern.service;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 真是的玩家
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    //打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        if (this.isProxy()) {

            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问!");
        }
    }

    //进游戏之前你肯定要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + " 的用户 " + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问!");
        }
    }

    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问!");
        }
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        }
        return true;
    }
}