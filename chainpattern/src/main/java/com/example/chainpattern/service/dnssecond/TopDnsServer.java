package com.example.chainpattern.service.dnssecond;

import com.alibaba.fastjson.JSON;
import com.example.chainpattern.service.dnsfirst.Recorder;

public class TopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级DNS服务器");
        System.out.println(String.format("中间过程:%s", JSON.toJSONString(recorder)));
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}
