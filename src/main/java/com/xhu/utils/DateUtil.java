package com.xhu.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date StringToDate(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = dateFormat.parse(date);
        return d;
    }

    public static Date getCurrentTime() {
        Date d = new Date(System.currentTimeMillis());
        return d;
    }

    public static String DateYYYYMMDD(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    public static Date getDayStart(Date date) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        String dateString = df.format(date);
        Date today = null;
        try {
            today = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return today;
    }

}
