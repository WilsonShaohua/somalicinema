package com.xhu.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 18:51
 */
@Slf4j
public class PageUtils {

    public static <T> List<T> page(Integer pageNo, int pageSize, List<T> objects) {
        if (objects == null || objects.size() == 0) return null;
        if (pageNo == null) pageNo = 0;
        int start = (pageNo - 1) * pageSize;
        if (start >= objects.size()) start = 0;
        List<T> list = new ArrayList<>();
        if (start + pageSize > objects.size()) {
            list.addAll(objects.subList(start, objects.size()));
        } else {
            list.addAll(objects.subList(start, start + pageSize));
        }
        return list;
    }
}
