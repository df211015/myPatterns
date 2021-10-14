package com.example.chainpattern.service.dnsfirst;

/**
 * 上海DNS服务解析器
 */
public class SHDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder echo = super.echo(domain);
        echo.setOwner("上海DNS服务器");
        return echo;
    }
}