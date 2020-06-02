package com.xhu.utils;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 18:51
 */
public class PageUtils {

    public static <T> List<T> page(Integer pageNo, int pageSize, List<T> objects) {
        if (pageNo == null) pageNo = 0;
        int start = pageNo * pageSize;
        if (start >= objects.size()) start = 0;
        List<T> list = null;
        if (start + pageSize > objects.size()) {
            list = objects.subList(start, objects.size());
        } else {
            list = objects.subList(start, pageSize);
        }
        return list;
    }
}
