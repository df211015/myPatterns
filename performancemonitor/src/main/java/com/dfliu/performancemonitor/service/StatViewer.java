package com.dfliu.performancemonitor.service;

import com.dfliu.performancemonitor.domain.dto.RequestStat;

import java.util.Map;

public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}
