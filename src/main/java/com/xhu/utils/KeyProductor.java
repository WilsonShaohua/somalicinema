package com.xhu.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liu li
 * @date 2020/5/24 12:40
 */
@Data
public class KeyProductor {
    private static final int default_key_length = 4;
    //生成日期格式
    private static String getDateYYMMDD(){
        SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
        return df.format(new Date()).toString();
    }

    //随机生成指定位长度数字
    private static String getTime(int key_length){
        final long time = System.currentTimeMillis();
        final int suffix = (int) (time % 10000);
        return  String.format("%0" + key_length+ "d", suffix);
    }
    //默认生成十位数key
    public static String getKey(int key_length){
        return getDateYYMMDD().concat(getTime(key_length));
    }
    public static String getKey(){
        return getDateYYMMDD().concat(getTime(default_key_length));
    }
}
