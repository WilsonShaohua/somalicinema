package com.xhu.controller;

import com.alibaba.fastjson.JSONObject;
import com.xhu.po.Movie;
import com.xhu.po.MoviePo;
import com.xhu.service.FieldService;
import com.xhu.service.MoviePoService;
import com.xhu.service.MovieService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.MovieSortCode;
import com.xhu.utils.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
@Slf4j
@RequestMapping(value = "/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private FieldService fieldService;

    @Autowired
    private MoviePoService moviePoService;


    /**
     * @param limit
     * @return
     */
    private List<MoviePo> now(int... limit) {
        //找到排片晚于当前且出版日期早于现在的电影
        List<Movie> movies = fieldService.findMovieAfterNow();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        //排序
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.HEATING_UP));
        log.info("/movie/now", moviePos);
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //正在热映
    @ApiOperation(value = "now", notes = "正在热映")
    @RequestMapping(value = "/now", method = RequestMethod.POST)
    public void now(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePo = now();
        int code = StateCode.FAIL;
        if (moviePo != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePo);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MoviePo> comingSoon(int... limit) {
        List<Movie> movies = movieService.findMovieByMoviePublishingDate();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        //排序
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.COMING_SOON));
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //即将上映
    @ApiOperation(value = "coming", notes = "即将上映")
    @RequestMapping(value = "/coming", method = RequestMethod.POST)
    public void comingSoon(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = comingSoon();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    /**
     * @param limit
     * @return
     */
    private List<MoviePo> hot(int... limit) {
        //找到排片晚于当前且出版日期早于现在的电影
        List<Movie> movies = fieldService.findMovieAfterNow();
        log.info(movies.toString());
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        if (moviePos == null) {
            return null;
        }
        log.info(moviePos.toString());
        //获取排序方式
        Comparator<MoviePo> movieInformationComparator = MovieSortCode.SORT_WAY.get(MovieSortCode.HOT_MOVIE);
        Collections.sort(moviePos, movieInformationComparator);
        log.info("sort scuess");
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //热播电影
    @ApiOperation(value = "hot", notes = "热播电影")
    @RequestMapping(value = "/hot", method = RequestMethod.POST)
    public void hot(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = hot();
        log.info(moviePos.toString());
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MoviePo> box(int... limit) {
        //找到排片晚于当前且出版日期早于现在的电影
        List<String> movieIds = fieldService.findTodayFeild();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovieIds(movieIds);
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TODAY_BOX));
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //今日票房
    @ApiOperation(value = "box", notes = "今日票房")
    @RequestMapping(value = "/box", method = RequestMethod.POST)
    public void box(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = box();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    /**
     * @param limit
     * @return
     */
    private List<MoviePo> expect(int... limit) {
        //上映日期晚于当前受期待电影
        List<Movie> movies = fieldService.findMovieAfterNow();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.MOST_EXPECT));
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //最受期待
    @ApiOperation(value = "expect", notes = "最受期待")
    @RequestMapping(value = "/expect", method = RequestMethod.POST)
    public void expect(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = expect();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    /**
     * @param limit
     * @return
     */
    private List<MoviePo> top100(int... limit) {
        //上映日期晚于当前受期待电影
        List<Movie> movies = movieService.findMovieBeforeNow();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TOP100));
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //Top100
    @ApiOperation(value = "top100", notes = "TOP100")
    @RequestMapping(value = "/top100", method = RequestMethod.POST)
    public void top100(HttpServletResponse response) throws IOException {
        //上映日期晚于当前受期待电影
        List<Movie> movies = movieService.findMovieBeforeNow();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TOP100));
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    @ApiOperation(value = "index", notes = "主页信息")
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public void index(HttpServletResponse response, HttpServletRequest request) throws IOException {
        int default_length = 8;
        List<List<MoviePo>> movieInformationLists = new ArrayList<>();
        movieInformationLists.add(now(default_length));
        movieInformationLists.add(hot(default_length));
        movieInformationLists.add(expect(default_length));
        movieInformationLists.add(top100(default_length));
        movieInformationLists.add(box(default_length));
        movieInformationLists.add(comingSoon(default_length));
        int code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformationLists);
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());

    }

}
