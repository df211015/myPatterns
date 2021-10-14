package com.example.chainpattern.service.dnsfirst;

/**
 * 全球顶级DNS服务解析器
 */
public class TopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder echo = super.echo(domain);
        echo.setOwner("全球顶级DNS服务器");
        return echo;
    }
}
