package com.example.demo100.business.impl;

import com.example.demo100.business.Filter;
import com.example.demo100.dto.Request;
import com.example.demo100.dto.Response;

public class SensitiveFilterImpl implements Filter {
    @Override
    public void doFilter(Request req, Response res) {
        String newReqStr = req.getRequestStr().replace("敏感词汇", "根据法律，相关内容不能显示")+"request被SensitiveFitler处理";
        req.setRequestStr(newReqStr);
        System.out.println(newReqStr);

        String newResStr = res.getResponseStr().replace("敏感词汇", "根据法律，相关内容不能显示")+"response被SensitiveFitler处理";
        res.setResponseStr(newResStr);
        System.out.println(newResStr);
    }
}