package com.example.permissiondata.service;

import com.example.permissiondata.constants.ProjConstants;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 接受者
 */
@Slf4j
public abstract class MyReceiver {
    /**
     * 初始化日期，注意month值域是[0-11]
     *
     * @return
     */
    public Calendar getMyCalender() {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(2020, 10, 10, 15, 0, 0);

        return myCalendar;
    }

    /**
     * @return
     */
    public String getMyCalenderStr() {
        Calendar myCalender = this.getMyCalender();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProjConstants.TimeFormat);
        String format = simpleDateFormat.format(myCalender.getTime());

        return format;
    }

    /**
     * 模板方式
     */
    public void getData() {
        try {
            this.loadTaskFile();
        } catch (IOException ex) {
            log.info("getData异常", ex);
        }
    }

    /**
     * 解析文件数据
     *
     * @throws IOException
     */
    public abstract void loadTaskFile() throws IOException;

    /**
     * sql输出到日志文件中
     */
    public abstract String process();
}
