package com.xhu.utils;

import com.xhu.po.Movie;
import com.xhu.po.MoviePo;
import com.xhu.service.TicketService;
import com.xhu.service.WantWatchService;
import com.xhu.service.WatchedhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.text.ParseException;
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
            Movie movie1 = o1.getMovie();
            Movie movie2 = o2.getMovie();
            String movieId1 = movie1.getMovieId();
            String movieId2 = movie2.getMovieId();
            double score1 = watchedService.movieScoreByMovieId(movieId1);
            double score2 = watchedService.movieScoreByMovieId(movieId2);
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
            BigDecimal totalTickedSaleToday1 = null;
            try {
                totalTickedSaleToday1 = watchedService.totalTickedSaleToday(moviePo1.getMovie().getMovieId());
            } catch (ParseException e) {

            }
            BigDecimal totalTickedSaleToday2 = null;
            try {
                totalTickedSaleToday2 = watchedService.totalTickedSaleToday(moviePo2.getMovie().getMovieId());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return totalTickedSaleToday1.compareTo(totalTickedSaleToday2);
        }
    };
    private static TicketService ticketService;
    public static Comparator<MoviePo> HEATING_UP = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo o1, MoviePo o2) {
            Movie movie1 = o1.getMovie();
            Movie movie2 = o2.getMovie();
            System.out.println("MovieInformationComparatorMethod");
            System.out.println(movie1);
            System.out.println(movie2);
            long totalTicket1 = ticketService.countTicketAmountByMovieId(movie1.getMovieId());
            long totalTicket2 = ticketService.countTicketAmountByMovieId(movie2.getMovieId());
            return Long.compare(totalTicket1, totalTicket2);
        }
    };
    public static Comparator<MoviePo> HOT_MOVIE = new Comparator<MoviePo>() {
        @Override
        public int compare(MoviePo o1, MoviePo o2) {
            Movie movie1 = o1.getMovie();
            Movie movie2 = o2.getMovie();
            BigDecimal totalMoney1 = ticketService.countIicketTotalBox(movie1.getMovieId());
            BigDecimal totalMoney2 = ticketService.countIicketTotalBox(movie2.getMovieId());
            return totalMoney1.compareTo(totalMoney2);
        }
    };
    private static WantWatchService wantWatchService;
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
            long wantWatchMovieInfomation1 = wantWatchService.countTotalWantByMovieId(moviePo1.getMovie().getMovieId());
            long wantWatchMovieInfomation2 = wantWatchService.countTotalWantByMovieId(moviePo2.getMovie().getMovieId());
            return Long.compare(wantWatchMovieInfomation1, wantWatchMovieInfomation2);
        }
    };
    @Autowired
    private WatchedhService watchedhServiceInit;
    @Autowired
    private TicketService ticketServiceInit;
    @Autowired
    private WantWatchService wantWatchServiceInit;

    @PostConstruct
    private void beforeInit() {
        watchedService = watchedhServiceInit;
        ticketService = ticketServiceInit;
        wantWatchService = wantWatchServiceInit;
    }

}
