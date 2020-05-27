package com.xhu.utils;

import com.google.common.collect.ImmutableMap;
import com.xhu.po.Movie;
import com.xhu.po.MovieInfomation;
import org.codehaus.jackson.map.util.Comparators;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/27 20:05
 * 电影排序信息状态接口
 * * 电影主页
 * * 正在热映
 * * 即将上映
 * * 热播电影
 * * 今日票房
 * * 最受期待
 * * Top100 评分
 */
public interface MovieSortCode {
    int INDEX = 0; //电影主页
    int HEATING_UP = 1; //正在热映
    int COMING_SOON = 2; //即将上映
    int HOT_MOVIE = 3; //热播电影
    int TODAY_BOX = 4; //今日票房
    int MOST_ANTICIPATED = 5; //最受期待
    int TOP100 = 6; //TOP100
    Map<Integer, String> MSG = ImmutableMap.<Integer, String>builder()
            .put(INDEX, "电影主页")
            .put(HEATING_UP, "正在热映")
            .put(COMING_SOON, "即将上映")
            .put(HOT_MOVIE, "热播电影")
            .put(TODAY_BOX, "今日票房")
            .put(MOST_ANTICIPATED, "正在热映")
            .put(TOP100, "最受期待")
            .build();


}
