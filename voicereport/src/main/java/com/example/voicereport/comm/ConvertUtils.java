package com.example.voicereport.comm;


import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertUtils {
    /**
     * "Dec 25, 2012 12:00:00 AM"
     *
     * @param time
     * @return
     * @throws ParseException
     */
    public static String convertToStdTime(String time) throws ParseException {
        if (StringUtils.isEmpty(time)) {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy K:m:s a", Locale.ENGLISH);
        Date date = format.parse(time);
        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    public static String convertToStdTime(Date time) {
        if (time == null) {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(time);
    }

    public static String convertToFormatTime(Date time, String pattern) {
        if (time == null) {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(time);
    }

    public static Date convertToDate(String time) throws ParseException {
        if (StringUtils.isEmpty(time)) {
            return null;
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        return format.parse(time);
    }

    public static Date convertToDate(String time,String format) throws ParseException {
        if (StringUtils.isEmpty(time)) {
            return null;
        }
        DateFormat frt = new SimpleDateFormat(format);
        return frt.parse(time);
    }

    public static String convertToDateTime(String time) throws ParseException {
        if (StringUtils.isEmpty(time)) {
            return "";
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = convertToDate(time);
        return format.format(date);
    }

    public static String convertToUTCTime(Date time) {
        if (time == null) {
            return null;
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        return format.format(time);
    }

    public static Integer getInt(String obj) {
        try {
            return Integer.parseInt(obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param d 源数字
     * @param pattern ####.00
     * @return 格式化的内容
     */
    public static String getDoubleFormat(Double d,String pattern){
        if(d == null){
            return "";
        }

        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(d);
    }
}
