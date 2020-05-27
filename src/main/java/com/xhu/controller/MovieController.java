package com.xhu.controller;

import com.xhu.po.Movie;
import com.xhu.po.MovieInfomation;
import com.xhu.service.ActorService;
import com.xhu.service.MovieActorService;
import com.xhu.service.MovieService;
import com.xhu.service.WatcedhService;
import com.xhu.utils.JSONUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Comparator;
import java.util.Date;

/**
 * 正在热映
 * 即将上映
 * 热播电影
 * 今日票房
 * 最受期待
 * Top100
 *
 * @author liu li
 * @date 2020/5/27 19:33
 */
@Api
@Controller
@RequestMapping(value = "/movie")
public class MovieController {
    /**
     * compare movieInformation1 and movieInformation2 publishing time
     * if publishing time equal return 0
     * if movieInformation1 publishing time later movieInformation2 publishing time return 1
     * if movieInformation1 publishing time less movieInformation2 publishing time return -1
     */
    private static final Comparator<MovieInfomation> PUBLISHING_Time_SORT = new Comparator<MovieInfomation>() {
        @Override
        public int compare(MovieInfomation movieInformation1, MovieInfomation movieInformation2) {
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
    private static final Comparator<MovieInfomation> SCORE_SORT = new Comparator<MovieInfomation>() {
        @Autowired
        private WatcedhService watchedService;

        @Override
        public int compare(MovieInfomation o1, MovieInfomation o2) {
            Movie movie1 = o1.getMovie();
            Movie movie2 = o2.getMovie();
            double score1 = watchedService.movieScoreByMovieId(movie1.getMovieId());
            double score2 = watchedService.movieScoreByMovieId(movie2.getMovieId());
            return Double.compare(score1, score2);
        }
    };
    private static final Comparator<MovieInfomation> TODAY_TICKET_SALE_MONEY = new Comparator<MovieInfomation>() {
        @Autowired
        private WatcedhService watchedService;

        @Override
        public int compare(MovieInfomation o1, MovieInfomation o2) {

            return 0;
        }
    };
    @Autowired
    private MovieService movieService;
    @Autowired
    private ActorService actorService;
    @Autowired
    private MovieActorService movieActorService;

    /***
     *
     * @param code 排序状态码
     * @param limit
     * @return
     */
    private MovieInfomation sortMovieInformation(String code, int... limit) {

        return null;
    }

    /**
     * 正在热映
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/hot", method = RequestMethod.POST)
    public void hot(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = JSONUtils.getRequestPostStr(request);


    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public void index(HttpServletResponse response, HttpServletRequest request) {

    }

}
