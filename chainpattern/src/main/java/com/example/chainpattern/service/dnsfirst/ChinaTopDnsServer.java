package com.example.chainpattern.service.dnsfirst;

/**
 * 中国顶级DNS服务解析器
 */
public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder echo = super.echo(domain);
        echo.setOwner("中国顶级DNS服务器");
        return echo;
    }
}
