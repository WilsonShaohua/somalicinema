package com.xhu.controller;

import com.alibaba.fastjson.JSONObject;
import com.xhu.po.Movie;
import com.xhu.po.MovieInformation;
import com.xhu.service.*;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.MovieSortCode;
import com.xhu.utils.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
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
@RequestMapping(value = "/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieActorService movieActorService;
    @Autowired
    private CityService cityService;
    @Autowired
    private MovieTypeService movieTypeService;
    @Autowired
    private FieldService fieldService;

    @Autowired
    private MovieInformationService movieInformationService;

    private List<MovieInformation> now(int... limit) {
        //找到排片晚于当前且出版日期早于现在的电影
        List<Movie> movies = fieldService.findMovieAfterNow();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovies(movies);
        //排序
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.HEATING_UP));
        if (limit != null)
            return movieInformations.subList(0, limit[0]);
        return movieInformations;
    }

    /**
     * 影片资源请求
     *
     * @param response
     */
//    @ApiOperation(value = "info", httpMethod = "POSt", notes = "请求电影详细信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "code", defaultValue = "0", dataType = "int"),
//            @ApiImplicitParam(name = "limit", defaultValue = "8", dataType = "int")
//    })
//    @RequestMapping(value = "/info", method = RequestMethod.POST)
//    public void info(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        List<Object> codeAndLimit = JSONUtils.MovieCodeAndLimit(request);
//        //将获取到的数据打包到Map中去，相应的请求码存放对应的数
//        Map<Integer, List<MovieInformation>> movieInformationsMap = new HashMap<>();
//
//        if (codeAndLimit.size() == 1) {
//            //详细请求
//            int code = (int) codeAndLimit.get(0);
//            List<MovieInformation> movieInformations = sortMovieInformation(code);
//            movieInformationsMap.put(code, movieInformations);
//        } else {
//            //主页请求
//            Map<String, Object> condition = (Map<String, Object>) codeAndLimit.get(1);
//            //请求主页内的六种信息
//            for (int i = MovieSortCode.HEATING_UP; i <= MovieSortCode.TOP100; i++) {
//                List<MovieInformation> movieInformations = sortMovieInformation(i, condition);
//                movieInformationsMap.put((Integer) codeAndLimit.get(0), movieInformations);
//            }
//        }
//        int code; //返回信息码
//        if (movieInformationsMap == null || movieInformationsMap.size() == 0) {
//            //数据获取失败
//            code = StateCode.FAIL;
//        } else {
//            //数据获取成功
//            code = StateCode.SUCCESS;
//        }
//        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformationsMap);
//        response.getWriter().write(jsonObject.toJSONString());
//    }

    //正在热映
    @ApiOperation(value = "now", notes = "正在热映")
    @RequestMapping(value = "/now", method = RequestMethod.POST)
    public void now(HttpServletResponse response) throws IOException {
        List<MovieInformation> movieInformations = now();
        int code = StateCode.FAIL;
        if (movieInformations != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformations);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MovieInformation> comingSoon(int... limit) {
        List<Movie> movies = movieService.findMovieByMoviePublishingDate();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovies(movies);
        //排序
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.COMING_SOON));
        if (limit != null)
            return movieInformations.subList(0, limit[0]);
        return movieInformations;
    }

    //即将上映
    @ApiOperation(value = "coming", notes = "即将上映")
    @RequestMapping(value = "/coming", method = RequestMethod.POST)
    public void comingSoon(HttpServletResponse response) throws IOException {
        List<MovieInformation> movieInformations = comingSoon();
        int code = StateCode.FAIL;
        if (movieInformations != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformations);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MovieInformation> hot(int... limit) {
        //找到排片晚于当前且出版日期早于现在的电影
        List<Movie> movies = fieldService.findMovieAfterNow();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovies(movies);
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.HOT_MOVIE));
        if (limit != null)
            return movieInformations.subList(0, limit[0]);
        return movieInformations;
    }

    //热播电影
    @ApiOperation(value = "hot", notes = "热播电影")
    @RequestMapping(value = "/hot", method = RequestMethod.POST)
    public void hot(HttpServletResponse response) throws IOException {
        List<MovieInformation> movieInformations = hot();
        int code = StateCode.FAIL;
        if (movieInformations != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformations);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MovieInformation> box(int... limit) {
        //找到排片晚于当前且出版日期早于现在的电影
        List<String> movieIds = fieldService.findTodayFeild();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovieIds(movieIds);
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TODAY_BOX));
        if (limit != null)
            return movieInformations.subList(0, limit[0]);
        return movieInformations;
    }

    //今日票房
    @ApiOperation(value = "box", notes = "今日票房")
    @RequestMapping(value = "/box", method = RequestMethod.POST)
    public void box(HttpServletResponse response) throws IOException {
        List<MovieInformation> movieInformations = box();
        int code = StateCode.FAIL;
        if (movieInformations != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformations);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MovieInformation> expect(int... limit) {
        //上映日期晚于当前受期待电影
        List<Movie> movies = fieldService.findMovieAfterNow();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovies(movies);
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.MOST_EXPECT));
        if (limit != null)
            return movieInformations.subList(0, limit[0]);
        return movieInformations;
    }

    //最受期待
    @ApiOperation(value = "expect", notes = "最受期待")
    @RequestMapping(value = "/expect", method = RequestMethod.POST)
    public void expect(HttpServletResponse response) throws IOException {
        List<MovieInformation> movieInformations = expect();
        int code = StateCode.FAIL;
        if (movieInformations != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformations);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MovieInformation> top100(int... limit) {
        //上映日期晚于当前受期待电影
        List<Movie> movies = movieService.findMovieBeforeNow();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovies(movies);
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TOP100));
        if (limit != null)
            return movieInformations.subList(0, limit[0]);
        return movieInformations;
    }

    //Top100
    @ApiOperation(value = "top100", notes = "TOP100")
    @RequestMapping(value = "/top100", method = RequestMethod.POST)
    public void top100(HttpServletResponse response) throws IOException {
        //上映日期晚于当前受期待电影
        List<Movie> movies = movieService.findMovieBeforeNow();
        //获取电影信息
        List<MovieInformation> movieInformations = movieInformationService.findMovieInformationByMovies(movies);
        movieInformations.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TOP100));
        int code = StateCode.FAIL;
        if (movieInformations != null)
            code = StateCode.SUCCESS;
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), movieInformations);

        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    @ApiOperation(value = "index", notes = "主页信息")
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public void index(HttpServletResponse response, HttpServletRequest request) throws IOException {
        int default_length = 8;
        List<List<MovieInformation>> movieInformationLists = new ArrayList<>();
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
