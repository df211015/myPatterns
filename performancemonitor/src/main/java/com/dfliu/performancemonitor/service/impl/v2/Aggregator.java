package com.dfliu.performancemonitor.service.impl.v2;

import com.dfliu.performancemonitor.domain.dto.RequestInfo;
import com.dfliu.performancemonitor.domain.dto.RequestStat;

import java.util.*;

public class Aggregator {
    public Map<String, RequestStat> aggregate(Map<String, List<RequestInfo>> requestInfos, long durationInMillis) {
        Map<String, RequestStat> requestStats = new HashMap<>();
        for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
            String apiName = entry.getKey();
            List<RequestInfo> requestInfosPerApi = entry.getValue();
            RequestStat requestStat = this.doAggregate(requestInfosPerApi, durationInMillis);
            requestStats.put(apiName, requestStat);
        }
        return requestStats;
    }

    /**
     * @param requestInfos
     * @param durationInMillis
     * @return
     */
    private RequestStat doAggregate(List<RequestInfo> requestInfos, long durationInMillis) {
        List<Double> respTimes = new ArrayList<>();
        for (RequestInfo requestInfo : requestInfos) {
            double respTime = requestInfo.getResponseTime();
            respTimes.add(respTime);
        }

        RequestStat requestStat = new RequestStat();
        double maxValue = this.max(respTimes);
        requestStat.setMaxResponseTime(maxValue);
        double minValue = this.min(respTimes);
        requestStat.setMinResponseTime(minValue);
        double avgValue = this.avg(respTimes);
        requestStat.setAvgResponseTime(avgValue);
        double percentile999Value = this.percentile999(respTimes);
        requestStat.setP999ResponseTime(percentile999Value);
        double percentile99Value = this.percentile99(respTimes);
        requestStat.setP99ResponseTime(percentile99Value);
        requestStat.setCount(respTimes.size());
        long tpsValue = (long) this.tps(respTimes.size(), durationInMillis / 1000);
        requestStat.setTps(tpsValue);

        return requestStat;
    }

    // 以下的函数的代码实现均省略...
    private double max(List<Double> dataset) {
        return 0d;
    }

    private double min(List<Double> dataset) {
        return 0d;
    }

    private double avg(List<Double> dataset) {
        return 0d;
    }

    private double tps(int count, double duration) {
        return 0d;
    }

    private double percentile999(List<Double> dataset) {
        return 0d;
    }

    private double percentile99(List<Double> dataset) {
        return 0d;
    }

    private double percentile(List<Double> dataset, double ratio) {
        return 0d;
    }
}