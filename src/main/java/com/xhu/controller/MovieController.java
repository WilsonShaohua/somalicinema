package com.xhu.controller;

import com.alibaba.fastjson.JSONObject;
import com.xhu.po.Movie;
import com.xhu.po.MoviePo;
import com.xhu.service.FieldService;
import com.xhu.service.MoviePoService;
import com.xhu.service.MovieService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.PageUtils;
import com.xhu.utils.constant.ConstantString;
import com.xhu.utils.constant.MovieSortCode;
import com.xhu.utils.constant.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

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
        if (moviePos == null || moviePos.size() == 0) {
            log.warn("/movie/now null date");
            return null;
        }
        moviePos = moviePoService.getTicketAmount(moviePos);
        //排序
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.HEATING_UP));

        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //正在热映
    @ApiOperation(value = "now", notes = "正在热映")
    @RequestMapping(value = "/now", method = RequestMethod.POST)
    public void now(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = now();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        //  moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        log.info("/movie/now response\n" + jsonObject.toJSONString());
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    private List<MoviePo> comingSoon(int... limit) {
        List<Movie> movies = movieService.findMovieByMoviePublishingDate();
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        if (moviePos == null || moviePos.size() == 0) {
            log.warn("/movie/coming null date");
            return null;
        }
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
//        moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        log.info("/movie/comming response \n" + jsonObject.toJSONString());
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

        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        if (moviePos == null || moviePos.size() == 0) {
            log.warn("/movie/hot null date");
            return null;
        }
        log.info("/movie/hot had date : " + moviePos.toString());
        //获取票房数据
        moviePos = moviePoService.getTodaySalledMoney(moviePos);
        //获取排序方式
        Comparator<MoviePo> movieInformationComparator = MovieSortCode.SORT_WAY.get(MovieSortCode.HOT_MOVIE);
        Collections.sort(moviePos, movieInformationComparator);

        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //热播电影
    @ApiOperation(value = "hot", notes = "热播电影")
    @RequestMapping(value = "/hot", method = RequestMethod.POST)
    public void hot(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = hot();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        //    moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        log.info("/movie/hot response: \n" + jsonObject.toJSONString());
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
        if (moviePos == null || moviePos.size() == 0) {
            log.warn("/movie/box null date");
            return null;
        }
        //添加票房数据
        moviePos = moviePoService.getSalledMoney(moviePos);
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TODAY_BOX));
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size()) {
            log.info("index请求");
            return moviePos.subList(0, limit[0]);
        }
        return moviePos;
    }

    //今日票房
    @ApiOperation(value = "box", notes = "今日票房", tags = "今日票房")
    @RequestMapping(value = "/box", method = RequestMethod.POST)
    public void box(HttpServletResponse response) throws IOException {
        List<MoviePo> moviePos = box();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        // moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        String jsonString = jsonObject.toJSONString();
        log.info("/movie/box : response：/n" + jsonString);
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonString);
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
        if (moviePos == null || moviePos.size() == 0) {
            log.error("/movie/expect : null date");
            return null;
        }
        //添加期待数据
        moviePos = moviePoService.getWantWatchAmount(moviePos);
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
        //moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        String jsonString = jsonObject.toJSONString();
        log.info("/movie/expect : response/n" + jsonString);
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonString);
    }

    /**
     * @param limit
     * @return
     */
    private List<MoviePo> top100(int... limit) {
        //上映日期晚于当前受期待电影
        List<Movie> movies = movieService.findMovieBeforeNow();
        log.info("top100 movies" + movies);
        //获取电影信息
        List<MoviePo> moviePos = moviePoService.findMoviePoByMovies(movies);
        if (moviePos == null || moviePos.size() == 0) {
            log.warn("/movie/top100 null data");
            return null;
        }
        moviePos = moviePoService.getScore(moviePos);
        moviePos.sort(MovieSortCode.SORT_WAY.get(MovieSortCode.TOP100));
        if (limit != null && limit.length > 0 && limit[0] <= moviePos.size())
            return moviePos.subList(0, limit[0]);
        return moviePos;
    }

    //Top100
    @ApiOperation(value = "top100", notes = "TOP100")
    @RequestMapping(value = "/top100", method = RequestMethod.POST)
    public void top100(HttpServletResponse response, @RequestBody int pageNo) throws IOException {
        //上映日期晚于当前受期待电影
        List<Movie> movies = movieService.findMovieBeforeNow();
        //获取电影信息
        List<MoviePo> moviePos = top100();
        int code = StateCode.FAIL;
        if (moviePos != null)
            code = StateCode.SUCCESS;
        moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        String jsonString = jsonObject.toJSONString();
        log.info("/movie/top100 response : \n" + jsonString);
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonString);
    }

    @ApiOperation(value = "index", notes = "主页信息")
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public void index(HttpServletResponse response) throws IOException {
        Map<String, List<MoviePo>> moviePoMap = new TreeMap<>();
        moviePoMap.put("now", now(ConstantString.DEFAULT_INDEX_PAGE_SIZE));
        moviePoMap.put("hot", hot(ConstantString.DEFAULT_INDEX_PAGE_SIZE));
        moviePoMap.put("expect", expect(ConstantString.DEFAULT_INDEX_PAGE_SIZE));
        moviePoMap.put("top100", top100(ConstantString.DEFAULT_INDEX_PAGE_SIZE));
        moviePoMap.put("box", box(ConstantString.DEFAULT_INDEX_PAGE_SIZE));
        moviePoMap.put("comingSoon", comingSoon(ConstantString.DEFAULT_INDEX_PAGE_SIZE));
        int code = StateCode.SUCCESS;

        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePoMap);

        String jsonString = jsonObject.toJSONString();
        log.info("/movie/index response :" + jsonString);
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonString);

    }


    //筛选 区域、影片类型、区域
    @ApiOperation(value = "screening", notes = "筛选功能", httpMethod = "post")
    @RequestMapping(value = "/screening", method = RequestMethod.POST)
    public void screening(HttpServletResponse response, HttpServletRequest request) throws IOException {
        JSONObject jsonObject = JSONUtils.getRequestJsonObject(request);
        log.info("json string :" + jsonObject.toJSONString());
        Integer pageNo = jsonObject.getInteger("pageNo");
        pageNo = pageNo == null ? 0 : pageNo;
        String areaId = jsonObject.getString("areaId");
        String typeId = jsonObject.getString("typeId");
        String yearsId = jsonObject.getString("yearsId");
        List<MoviePo> moviePos = moviePoService.selectByScreeningConditions(areaId, typeId, yearsId);
        int code = StateCode.FAIL;
        if (moviePos != null && moviePos.size() > 0) {
            code = StateCode.SUCCESS;
        }
        moviePos = PageUtils.page(pageNo, ConstantString.DEFAULT_MENU_PAGE_SIZE, moviePos);
        jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePos);
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }
}
