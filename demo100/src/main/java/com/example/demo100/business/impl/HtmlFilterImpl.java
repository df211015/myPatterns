package com.example.demo100.business.impl;

import com.example.demo100.business.Filter;
import com.example.demo100.dto.Request;
import com.example.demo100.dto.Response;

public class HtmlFilterImpl implements Filter {
    @Override
    public void doFilter(Request req, Response res) {
        String newReqStr = req.getRequestStr().replace("<", "[").replace(">", "]") + "request被HTMLFilter处理";
        req.setRequestStr(newReqStr);
        System.out.println(newReqStr);

        String newResStr = res.getResponseStr().replace("<", "[").replace(">", "]") + "response被HTMLFilter处理";
        res.setResponseStr(newResStr);
        System.out.println(newResStr);
    }
}