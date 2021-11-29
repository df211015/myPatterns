package com.dfliu.performancemonitor.service.impl.v2;

import com.dfliu.performancemonitor.domain.dto.RequestInfo;
import com.dfliu.performancemonitor.service.MetricsStorage;
import org.apache.commons.lang.StringUtils;

public class MetricsCollector {
    private MetricsStorage metricsStorage;//基于接口而非实现编程

    //依赖注入
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    //用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        this.metricsStorage.saveRequestInfo(requestInfo);
    }
}