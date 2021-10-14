package com.example.chainpattern.service.dnsfirst;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * dns解析抽象类
 */
public abstract class DnsServer {
    private DnsServer upperServer;

    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (this.isLocal(domain)) {
            recorder = this.echo(domain);
        } else {
            if (this.upperServer != null) {
                recorder = this.upperServer.resolve(domain);
            }
        }
        System.out.println(String.format("中间过程:%s", JSON.toJSONString(recorder)));
        return recorder;
    }

    /**
     * 设置每个节点的上级解析者
     *
     * @param upperServer
     */
    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    /**
     * 判断是否符合当前dns解析节点
     * @param domain
     * @return
     */
    protected abstract boolean isLocal(String domain);

    /**
     * 获取记录信息
     *
     * @param domain
     * @return
     */
    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setIp(this.genIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    /**
     * 随机生成ip地址
     *
     * @return
     */
    private String genIpAddress() {
        Random rand = new Random();
        String ipAddress = String.format("%s.%s.%s.%s",
                rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255));
        return ipAddress;
    }
}
