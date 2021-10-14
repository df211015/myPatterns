package com.example.chainpattern.service.dns;

public class DnsOfChina extends DnsParse {
    public DnsOfChina() {
        super(DnsParse.DNS_PARSE_CHINA);
    }

    @Override
    public void response() {
        System.out.println("DNS_中国解析完成");
    }
}
