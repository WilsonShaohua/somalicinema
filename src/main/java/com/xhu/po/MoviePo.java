package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/27 11:15
 * 电影信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoviePo {
    private Movie movie;
    private List<Actor> actors;
    private WorldCountry area;
    private Years years;
    private MovieType movieType;
    //卖出电影票数量
    private long ticketAmount;
    //票房
    private BigDecimal salledMoney;

    //今日票房
    private BigDecimal todaySalledMoney;
    //评分
    private double score;
    //想看
    private long wantWatch;


}
