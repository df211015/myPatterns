package com.dfliu.performancemonitor.service;

import com.dfliu.performancemonitor.domain.dto.RequestInfo;

import java.util.List;
import java.util.Map;

public interface MetricsStorage {
    /**
     * 保存
     *
     * @param requestInfo
     */
    void saveRequestInfo(RequestInfo requestInfo);

    /**
     *
     * @param apiName
     * @param startTimeInMillis
     * @param endTimeInMillis
     * @return
     */
    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    /**
     *
     * @param startTimeInMillis
     * @param endTimeInMillis
     * @return
     */
    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
