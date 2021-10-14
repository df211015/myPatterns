package com.example.chainpattern.service.dns;

public class DnsOfTop extends DnsParse {
    public DnsOfTop() {
        super(DnsParse.DNS_PARSE_TOP);
    }

    @Override
    public void response() {
        System.out.println("DNS_全球解析完成!");
    }
}
