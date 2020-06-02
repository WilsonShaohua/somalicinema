package com.xhu.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/6/2 9:45
 */
public class ListUtils {
    public static final <T> List<String> getEntryId(List<T> list) {
        List<String> ids = new ArrayList<>();
        for (T item : list) {
            ids.add(item.toString());
        }
        return ids;
    }
}
