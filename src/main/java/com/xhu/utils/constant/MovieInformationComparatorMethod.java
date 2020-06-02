package com.xhu.utils.constant;

import com.xhu.po.Movie;
import com.xhu.po.MoviePo;
import com.xhu.service.WatchedhService;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.Date;

/**
 * @author liu li
 * @date 2020/5/30 13:54
 */
@Component
public class MovieInformationComparatorMethod {

    /**
     * compare movieInformation1 and movieInformation2 publishing time
     * if publishing time equal return 0
     * if movieInformation1 publishing time later movieInformation2 publishing time return 1
     * if movieInformation1 publishing time less movieInformation2 publishing time return -1
     */
    public static Comparator<MoviePo> PUBLISHING_TIME = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo moviePo1, MoviePo moviePo2) {
            Movie movie1 = moviePo1.getMovie();
            Movie movie2 = moviePo2.getMovie();
            Date publishingDate1 = movie1.getMoviePublishingData();
            Date publishingDate2 = movie2.getMoviePublishingData();
            return publishingDate1.compareTo(publishingDate2);
        }
    };
    private static WatchedhService watchedService;
    /**
     * compare movieInformation1 and movieInformation2 publishing time
     * if movie score equal return 0
     * if movieInformation1 movie score later movieInformation2 movie score return 1
     * if movieInformation1 movie score less movieInformation2 movie score return -1
     */
    public static Comparator<MoviePo> SCORE_SORT = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo o1, MoviePo o2) {
            double score1 = o1.getScore();
            double score2 = o2.getScore();
            return Double.compare(score1, score2);
        }
    };
    /**
     * compare movieInformation1 and movieInformation2 today ticket sale money
     * if movie today ticket sale money equal return 0
     * if movieInformation1 movie today ticket sale money bigger movieInformation2 movie today ticket sale money return 1
     * if movieInformation1 movie today ticket sale money smaller movieInformation2 movie today ticket sale money return -1
     */
    public static Comparator<MoviePo> TODAY_TICKET_SALE_MONEY = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo moviePo1, MoviePo moviePo2) {
            return moviePo1.getSalledMoney().compareTo(moviePo2.getSalledMoney());
        }
    };

    public static Comparator<MoviePo> HEATING_UP = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo o1, MoviePo o2) {
            return Long.compare(o1.getTicketAmount(), o2.getTicketAmount());
        }
    };
    public static Comparator<MoviePo> HOT_MOVIE = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo o1, MoviePo o2) {
            return o1.getTodaySalledMoney().compareTo(o2.getTodaySalledMoney());
        }
    };

    /**
     * 最受期待
     * compare movieInformation1 and movieInformation2 most want watch
     * if movie today ticket sale money equal return 0
     * if movieInformation1 movie  most want watch bigger movieInformation2 movie today  most want watch return 1
     * if movieInformation1 movie  most want watch money smaller movieInformation2 movie  most want watch return -1
     */
    public static Comparator<MoviePo> MOST_ANTICIPATED = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo moviePo1, MoviePo moviePo2) {
            return Long.compare(moviePo1.getWantWatch(), moviePo2.getWantWatch());
        }
    };

}
