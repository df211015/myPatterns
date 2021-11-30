package com.dfliu.performancemonitor.service.impl.v2;

import com.dfliu.performancemonitor.domain.dto.RequestStat;
import com.dfliu.performancemonitor.service.StatViewer;
import com.google.gson.Gson;

import java.util.Map;

public class ConsoleViewer implements StatViewer {
    @Override
    public void output(
            Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson(requestStats));
    }
}