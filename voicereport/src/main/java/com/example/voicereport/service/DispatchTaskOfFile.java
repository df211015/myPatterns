package com.example.voicereport.service;

import com.example.voicereport.comm.ConvertUtils;
import com.example.voicereport.comm.StringProcess;
import com.example.voicereport.config.ReportConfig;
import com.example.voicereport.dto.CarReportTimeInfo;
import com.example.voicereport.dto.DispatchTask;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 智能小喇叭
 * 作者:liudengfeng
 * Email:251334456@qq.com
 * 2020.05.05
 */
@Slf4j
@Service
public class DispatchTaskOfFile implements IDispatchTask {
    private final String OrderInfoFile = "OrderInfo";
    private final String OrderDetailInfoFile = "OrderDetailInfo";
    private final Vector<DispatchTask> lstDispatchTask;
    private final List<CarReportTimeInfo> lstCarReportTimeInfo;
    private ReportConfig reportConfig;
    private StringProcess stringProcess;

    @Autowired
    public DispatchTaskOfFile(ReportConfig reportConfig, StringProcess stringProcess) {
        this.reportConfig = reportConfig;
        this.stringProcess = stringProcess;
        this.lstCarReportTimeInfo = new ArrayList<>();
        this.lstDispatchTask = this.getData();
    }

    @Override
    public Vector<DispatchTask> getData() {
        try {
            Vector<DispatchTask> dispatchTasks = this.loadTaskFile();
            return dispatchTasks;
        } catch (IOException ex) {
            log.info("getData异常", ex);
        }
        return null;
    }

    @Override
    public synchronized void process(Date fireDate) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Calendar myCalendar = Calendar.getInstance();
            //设置触发播报时间
            myCalendar.setTime(fireDate);
            int hour = myCalendar.get(Calendar.HOUR_OF_DAY);
            int minute = myCalendar.get(Calendar.MINUTE);
            if (this.lstDispatchTask != null) {
                Optional<DispatchTask> first = this.lstDispatchTask.stream().filter(r -> r.getHour().equals(hour) && r.getMinute().equals(minute)).findFirst();
                if (first.isPresent()) {
                    DispatchTask dispatchTask = first.get();
                    //获取任务后从播报列表中给移除
                    this.lstDispatchTask.remove(dispatchTask);
                    log.info(String.format("%s,本轮语音播报开始,重复%s次,每次间隔%s秒......", simpleDateFormat.format(fireDate), reportConfig.getReportRepeat(), reportConfig.getReportInterval() / 1000));
                    try {
                        int iCount = 1;
                        do {
                            log.info(String.format(">>>>>开始第%s次播报", iCount));
                            this.stringProcess.process(dispatchTask.getContent());
                            Thread.sleep(this.reportConfig.getReportInterval());
                            iCount++;
                        } while (this.reportConfig.getReportRepeat() >= iCount);
                        log.info(String.format("%s,本轮语音播报结束", simpleDateFormat.format(fireDate)));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    log.info(String.format("监控时间服务结束,监控时间点:%s,该时间点没有语音播报任务", simpleDateFormat.format(fireDate)));
                }
            }
        } catch (Exception ex) {
            log.error("process异常", ex);
        }
    }

    /**
     * 初始化数据
     * 数据以#开头的为注释,实际数据初始化会忽略该行
     *
     * @throws IOException
     */
    private Vector<DispatchTask> loadTaskFile() throws IOException {
        Vector<DispatchTask> lstData = new Vector<>();
        ClassPathResource classPathResourceOfOrderInfo = new ClassPathResource(this.OrderInfoFile);
        InputStream inputStreamOfOrderInfo = classPathResourceOfOrderInfo.getInputStream();
        BufferedReader readerOfOrderInfo = new BufferedReader(new InputStreamReader(inputStreamOfOrderInfo, "UTF-8"));

        ClassPathResource classPathResourceOfOrderDetailInfo = new ClassPathResource(this.OrderDetailInfoFile);
        InputStream inputStreamOfOrderDetailInfo = classPathResourceOfOrderDetailInfo.getInputStream();
        BufferedReader readerOfOrderDetailInfo = new BufferedReader(new InputStreamReader(inputStreamOfOrderDetailInfo, "UTF-8"));

        List<String> lstOrderDetailInfoLine = new ArrayList<>();
        String orderDetailInfoLineTmp;
        while ((orderDetailInfoLineTmp = readerOfOrderDetailInfo.readLine()) != null) {
            if (!orderDetailInfoLineTmp.startsWith("#")) {
                lstOrderDetailInfoLine.add(orderDetailInfoLineTmp);
            }
        }

        String orderInfoLine;
        String prefixTemplate = this.reportConfig.getReportPrefixtemplate();
        Integer i = 0;
        while ((orderInfoLine = readerOfOrderInfo.readLine()) != null) {
            if (!orderInfoLine.trim().startsWith("#")) {
                String orderDetailInfoLine = lstOrderDetailInfoLine.get(i);
                this.parsLineData(orderInfoLine.trim(), orderDetailInfoLine.trim(), prefixTemplate);
                i++;
            }
        }
        this.processTaskData(lstData);
        inputStreamOfOrderInfo.close();
        readerOfOrderInfo.close();

        return lstData;
    }

    /**
     * 解析文件格式数据
     *
     * @param orderInfo       车号及师傅信息
     * @param orderDetailInfo 发车时间点信息
     * @param prefixTemplate  播报内容的前缀处理
     */
    private void parsLineData(String orderInfo, String orderDetailInfo, String prefixTemplate) {
        try {
            if (StringUtils.isNotBlank(orderInfo)) {
                String[] split = orderInfo.split("#");
                if (split != null && split.length >= 2) {
                    String splitCarName = split[0];
                    String splitCarInfo = split[1];
                    if (StringUtils.isNotBlank(splitCarName) && StringUtils.isNotBlank(splitCarInfo)) {
                        String[] splitOrderInfoItems = splitCarInfo.split(",");
                        if (splitOrderInfoItems != null && splitOrderInfoItems.length >= 2) {
                            String carNo = splitOrderInfoItems[0];
                            String driver = splitOrderInfoItems[1];
                            if (StringUtils.isNotBlank(orderDetailInfo)) {
                                String[] splitOrderDetailInfo = orderDetailInfo.split(",");
                                for (String item : splitOrderDetailInfo) {
                                    String reportTimeString = this.getReportTimeString(item);
                                    CarReportTimeInfo carReportTimeInfo = this.buildCarReportTimeInfo(splitCarName, carNo, driver, reportTimeString);
                                    Optional<CarReportTimeInfo> first = this.lstCarReportTimeInfo.stream().filter(r -> r.getKey().equals(carReportTimeInfo.getKey())).findFirst();
                                    if (first.isPresent()) {
                                        CarReportTimeInfo carReportTimeInfoFirst = first.get();
                                        String initContent = carReportTimeInfoFirst.getValue();
                                        carReportTimeInfoFirst.setValue(String.format("%s%s", initContent, carReportTimeInfo.getValue()));
                                    } else {
                                        this.lstCarReportTimeInfo.add(carReportTimeInfo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            log.error("parsLineData异常", ex);
        }
    }

    /**
     * @param lstData
     */
    private void processTaskData(Vector<DispatchTask> lstData) {
        try {
            String prefixTemplate = this.reportConfig.getReportPrefixtemplate();
            for (CarReportTimeInfo item : this.lstCarReportTimeInfo) {
                String[] splitTimeItems = item.getKey().split(":");
                DispatchTask dispatchTask = new DispatchTask();
                Integer hour = Integer.valueOf(String.valueOf(splitTimeItems[0]));
                Integer minute = Integer.valueOf(String.valueOf(splitTimeItems[1]));
                dispatchTask.setHour(hour);
                dispatchTask.setMinute(minute);
                String content = String.format("%s%s", String.format(prefixTemplate, hour, minute), item.getValue());
                dispatchTask.setContent(content);
                log.info(String.format("%s#%s", item.getKey(), item.getValue()));
                lstData.add(dispatchTask);
            }
        } catch (Exception ex) {
            log.info("processTaskData异常", ex);
        }
    }

    /**
     * @param splitCarName
     * @param carNo
     * @param driver
     * @param reportTimeString
     * @return
     */
    private CarReportTimeInfo buildCarReportTimeInfo(String splitCarName, String carNo, String driver, String reportTimeString) {
        CarReportTimeInfo carReportTimeInfo = new CarReportTimeInfo();
        carReportTimeInfo.setKey(reportTimeString);
        switch (splitCarName) {
            case "3":
                carReportTimeInfo.setValue(String.format("请开往荆江村的,三路公交,%s,%s,准备发班了;", carNo, driver));
                break;
            case "4":
                carReportTimeInfo.setValue(String.format("请开往运通考训的,四路公交,%s,%s,准备发班了;", carNo, driver));
                break;
        }
        return carReportTimeInfo;
    }

    /**
     * 获取获取时间点减掉分钟后的时间串
     *
     * @param strTime 标准监控时间点
     * @return String
     */
    private String getReportTimeString(String strTime) {
        try {
            Date date = ConvertUtils.convertToDate(String.format("2020-01-01 %s", strTime), "yyyy-MM-dd HH:mm");
            Calendar myCalendar = Calendar.getInstance();
            myCalendar.setTime(date);
            myCalendar.add(Calendar.MINUTE, this.reportConfig.getReportSubminute() * -1);
            return String.format("%02d:%02d", myCalendar.get(Calendar.HOUR_OF_DAY), myCalendar.get(Calendar.MINUTE));
        } catch (Exception ex) {
            log.info("getReportTimeString异常", ex);
        }
        return null;
    }
}