package com.xhu.po;

import com.xhu.utils.KeyProductor;

import java.util.Date;

/**
 * @author liu li
 * @date 2020/6/2 15:41
 */
public class MovieTest {
    public void createDate() {
        Date date = new Date(2020, 6, 9);
        String id = KeyProductor.getKey();
        //Movie movie = new Movie(id,,,date,"","www.bing.com", "img/photo.jpg", ");
    }
}
