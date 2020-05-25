package com.xhu.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date StringToDate(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = dateFormat.parse(date);
        return d;
    }
    public static Date getCurrentTime(){
        Date d = new Date(System.currentTimeMillis());
        return d;
    }
}
