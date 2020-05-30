package com.xhu.utils;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liu li
 * @date 2020/5/27 10:35
 */
public class DateUtilTest {

    @Test
    public void dateString() throws ParseException {
        Date now = DateUtil.getCurrentTime();
        System.out.println(now);
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date today = null;

        String s = dateFormat.format(now);
        System.out.println(s);

        today = dateFormat.parse(s);
        System.out.println(today);
    }

}
