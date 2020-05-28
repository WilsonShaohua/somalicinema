package com.xhu.utils;

import com.google.common.collect.ImmutableMap;
import com.xhu.po.Movie;
import com.xhu.po.MovieInformation;
import com.xhu.service.TicketService;
import com.xhu.service.WantWatchService;
import com.xhu.service.WatcedhService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
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

    Map<Integer, Comparator<MovieInformation>> SORT_WAY = ImmutableMap.<Integer, Comparator<MovieInformation>>builder()
            .put(INDEX, null)
            .put(HEATING_UP, MovieInformationSort.HEATING_UP) //上映日期总票房
            .put(COMING_SOON, MovieInformationSort.PUBLISHING_TIME) //上映日期排序
            .put(HOT_MOVIE, MovieInformationSort.HOT_MOVIE) //上映日期总票数
            .put(TODAY_BOX, MovieInformationSort.TODAY_TICKET_SALE_MONEY) //今日票房
            .put(MOST_EXPECT, MovieInformationSort.MOST_ANTICIPATED) //最受期待
            .put(TOP100, MovieInformationSort.SCORE_SORT) //高分排序
            .put(DATE_AGE, MovieInformationSort.PUBLISHING_TIME) //出版年代
            .build();


    interface MovieInformationSort {
        /**
         * compare movieInformation1 and movieInformation2 publishing time
         * if publishing time equal return 0
         * if movieInformation1 publishing time later movieInformation2 publishing time return 1
         * if movieInformation1 publishing time less movieInformation2 publishing time return -1
         */
        Comparator<MovieInformation> PUBLISHING_TIME = new Comparator<MovieInformation>() {
            @Override
            public int compare(MovieInformation movieInformation1, MovieInformation movieInformation2) {
                Movie movie1 = movieInformation1.getMovie();
                Movie movie2 = movieInformation2.getMovie();
                Date publishingDate1 = movie1.getMoviePublishingData();
                Date publishingDate2 = movie2.getMoviePublishingData();
                return publishingDate1.compareTo(publishingDate2);
            }
        };
        /**
         * compare movieInformation1 and movieInformation2 publishing time
         * if movie score equal return 0
         * if movieInformation1 movie score later movieInformation2 movie score return 1
         * if movieInformation1 movie score less movieInformation2 movie score return -1
         */
        Comparator<MovieInformation> SCORE_SORT = new Comparator<MovieInformation>() {
            @Autowired
            private WatcedhService watchedService;

            @Override
            public int compare(MovieInformation o1, MovieInformation o2) {
                Movie movie1 = o1.getMovie();
                Movie movie2 = o2.getMovie();
                double score1 = watchedService.movieScoreByMovieId(movie1.getMovieId());
                double score2 = watchedService.movieScoreByMovieId(movie2.getMovieId());
                return Double.compare(score1, score2);
            }
        };
        /**
         * compare movieInformation1 and movieInformation2 today ticket sale money
         * if movie today ticket sale money equal return 0
         * if movieInformation1 movie today ticket sale money bigger movieInformation2 movie today ticket sale money return 1
         * if movieInformation1 movie today ticket sale money smaller movieInformation2 movie today ticket sale money return -1
         */
        Comparator<MovieInformation> TODAY_TICKET_SALE_MONEY = new Comparator<MovieInformation>() {
            @Autowired
            private WatcedhService watchedService;

            @Override
            public int compare(MovieInformation movieInformation1, MovieInformation movieInformation2) {
                BigDecimal totalTickedSaleToday1 = watchedService.totalTickedSaleToday(movieInformation1.getMovie().getMovieId());
                BigDecimal totalTickedSaleToday2 = watchedService.totalTickedSaleToday(movieInformation2.getMovie().getMovieId());
                return totalTickedSaleToday1.compareTo(totalTickedSaleToday2);
            }
        };
        /**
         * 最受期待
         * compare movieInformation1 and movieInformation2 most want watch
         * if movie today ticket sale money equal return 0
         * if movieInformation1 movie  most want watch bigger movieInformation2 movie today  most want watch return 1
         * if movieInformation1 movie  most want watch money smaller movieInformation2 movie  most want watch return -1
         */
        Comparator<MovieInformation> MOST_ANTICIPATED = new Comparator<MovieInformation>() {
            @Autowired
            private WantWatchService wantWatchService;

            @Override
            public int compare(MovieInformation movieInformation1, MovieInformation movieInformation2) {
                long wantWatchMovieInfomation1 = wantWatchService.countTotalWantByMovieId(movieInformation1.getMovie().getMovieId());
                long wantWatchMovieInfomation2 = wantWatchService.countTotalWantByMovieId(movieInformation2.getMovie().getMovieId());
                return Long.compare(wantWatchMovieInfomation1, wantWatchMovieInfomation2);
            }
        };

        Comparator<MovieInformation> HEATING_UP = new Comparator<MovieInformation>() {
            @Autowired
            private TicketService ticketService;

            @Override
            public int compare(MovieInformation o1, MovieInformation o2) {
                Movie movie1 = o1.getMovie();
                Movie movie2 = o2.getMovie();
                long totalTicket1 = ticketService.countTicketAmountByMovieId(movie1.getMovieId());
                long totalTicket2 = ticketService.countTicketAmountByMovieId(movie2.getMovieId());
                return Long.compare(totalTicket1, totalTicket2);
            }
        };
        Comparator<MovieInformation> HOT_MOVIE = new Comparator<MovieInformation>() {
            @Autowired
            private TicketService ticketService;

            @Override
            public int compare(MovieInformation o1, MovieInformation o2) {
                Movie movie1 = o1.getMovie();
                Movie movie2 = o2.getMovie();
                BigDecimal totalMoney1 = ticketService.countIicketTotalBox(movie1.getMovieId());
                BigDecimal totalMoney2 = ticketService.countIicketTotalBox(movie2.getMovieId());
                return totalMoney1.compareTo(totalMoney2);
            }
        };
    }

}
