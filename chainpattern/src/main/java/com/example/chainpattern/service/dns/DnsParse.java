package com.example.chainpattern.service.dns;

/**
 * DNS解析
 */
public abstract class DnsParse {
    public final static Integer DNS_PARSE_SHANGHAI = 1;
    public final static Integer DNS_PARSE_CHINA = 2;
    public final static Integer DNS_PARSE_TOP = 3;

    private DnsParse nextDnsParse;
    private Integer dnsParseLevel;

    public DnsParse(Integer dnsParseLevel){
        this.dnsParseLevel = dnsParseLevel;
    }

    public void setNextDnsParse(DnsParse nextDnsParse) {
        this.nextDnsParse = nextDnsParse;
    }

    public void parse(RequestDns requestDns) {
        if (this.dnsParseLevel.equals(requestDns.getRequestLevel())) {
            this.response();
        } else {
            if (this.nextDnsParse != null) {
                this.nextDnsParse.parse(requestDns);
            } else {
                System.out.println("处理失败!");
            }
        }
    }

    public abstract void response();
}
