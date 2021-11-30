package com.dfliu.performancemonitor.service.impl.v2;

import com.dfliu.performancemonitor.domain.dto.RequestInfo;
import com.dfliu.performancemonitor.service.MetricsStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedisMetricsStorage implements MetricsStorage {

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        return;
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        Map<String, List<RequestInfo>> map = new HashMap<>();
        RequestInfo requestInfo = null;
        List<RequestInfo> lstRegister = new ArrayList<>();
        ;
        requestInfo = new RequestInfo("register", 123, 10234);
        lstRegister.add(requestInfo);
        requestInfo = new RequestInfo("register", 223, 11234);
        lstRegister.add(requestInfo);
        requestInfo = new RequestInfo("register", 323, 12334);
        lstRegister.add(requestInfo);
        map.put("register", lstRegister);

        List<RequestInfo> lstLogin = new ArrayList<>();
        requestInfo = new RequestInfo("login", 23, 12434);
        lstLogin.add(requestInfo);
        requestInfo = new RequestInfo("login", 1223, 14234);
        lstLogin.add(requestInfo);
        map.put("login", lstLogin);

        return map;
    }
}