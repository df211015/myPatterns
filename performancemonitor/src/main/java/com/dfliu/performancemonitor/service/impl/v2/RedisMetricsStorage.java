package com.dfliu.performancemonitor.service.impl.v2;

import com.dfliu.performancemonitor.domain.dto.RequestInfo;
import com.dfliu.performancemonitor.service.MetricsStorage;

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
        return null;
    }
}