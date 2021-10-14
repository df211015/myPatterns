package com.example.proxypattern.service;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 代练者
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    //代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    //代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);

    }

    //代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
