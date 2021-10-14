package com.example.chainpattern.service.dns;

public class DnsOfShanghai extends DnsParse {
    public DnsOfShanghai() {
        super(DnsParse.DNS_PARSE_SHANGHAI);
    }

    @Override
    public void response() {
        System.out.println("DNS_上海解析完成!");
    }
}
