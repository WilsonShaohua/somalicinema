package com.xhu.utils.constant;

import com.google.common.collect.ImmutableMap;
import com.xhu.po.MoviePo;

import java.util.Comparator;
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
    int MOST_EXPECT = 5; //最受期待
    int TOP100 = 6; //TOP100
    int DATE_AGE = 7; //年代
    Map<Integer, String> MSG = ImmutableMap.<Integer, String>builder()
            .put(INDEX, "电影主页")
            .put(HEATING_UP, "正在热映")
            .put(COMING_SOON, "即将上映")
            .put(HOT_MOVIE, "热播电影")
            .put(TODAY_BOX, "今日票房")
            .put(MOST_EXPECT, "最受期待")
            .put(TOP100, "TOP100")
            .put(DATE_AGE, "年代")
            .build();

    Map<Integer, Comparator<MoviePo>> SORT_WAY = ImmutableMap.<Integer, Comparator<MoviePo>>builder()
            .put(HEATING_UP, MovieInformationComparatorMethod.HEATING_UP) //上映日期总票房
            .put(COMING_SOON, MovieInformationComparatorMethod.PUBLISHING_TIME) //上映日期排序
            .put(HOT_MOVIE, MovieInformationComparatorMethod.HOT_MOVIE) //上映日期总票数
            .put(TODAY_BOX, MovieInformationComparatorMethod.TODAY_TICKET_SALE_MONEY) //今日票房
            .put(MOST_EXPECT, MovieInformationComparatorMethod.MOST_ANTICIPATED) //最受期待
            .put(TOP100, MovieInformationComparatorMethod.SCORE_SORT) //高分排序
            .put(DATE_AGE, MovieInformationComparatorMethod.PUBLISHING_TIME) //出版年代
            .build();



}
