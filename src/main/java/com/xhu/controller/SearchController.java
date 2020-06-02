package com.xhu.controller;

import com.alibaba.fastjson.JSONObject;
import com.xhu.po.Movie;
import com.xhu.po.MoviePo;
import com.xhu.service.*;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.constant.SplitCharConstant;
import com.xhu.utils.constant.StateCode;
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/6/1 20:27
 */
@Api
@Slf4j
@Controller
public class SearchController {
    @Autowired
    private ActorService actorService;
    @Autowired
    private MovieActorService movieActorService;
    @Autowired
    private MoviePoService moviePoService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieTypeService movieTypeService;

    //实现搜索功能
    //无分页信息

    @ApiOperation(value = "search", notes = "搜索接口", httpMethod = "post")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取前端json数据
        JSONObject jsonObject = JSONUtils.getRequestJsonObject(request);
        String codition = jsonObject.getString("search");
        //解析搜索字段
        String[] conditions = codition.split(SplitCharConstant.SPLIT_CHARS);
        for (String condition : conditions) {
            log.info("condition：" + condition);
        }
        Set<Movie> movieSet = new HashSet<>();
        //查询演员信息
        Set<String> actorSet = actorService.searchAcotrId(conditions);
        log.info("actor ids\n" + actorSet);
        List<String> actorList = new ArrayList<>(actorSet);
        log.info("actor list \n" + actorList);
        Set<Movie> movieSetFromActor = movieActorService.findMvoieByActorId(new ArrayList<String>(actorSet));
        if (movieSetFromActor != null && movieSetFromActor.size() > 0)
            movieSet.addAll(movieSetFromActor);
        log.info("movie set\n" + movieSet);
        //查询电影信息
        Set<Movie> movieSetFromMovie = movieService.search(conditions);
        if (movieSetFromMovie != null && movieSetFromMovie.size() > 0)
            movieSet.addAll(movieSetFromMovie);
        log.info("movie set\n" + movieSet);
        Set<MoviePo> moviePoSet = new HashSet<>(moviePoService.findMoviePoByMovies(new ArrayList<>(movieSet)));
        log.info("movie po set \n" + moviePoSet);
        int code = StateCode.FAIL;
        if (moviePoSet != null) {
            code = StateCode.SUCCESS;
        }

        jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), moviePoSet);
        log.info("/search response json " + jsonObject.toJSONString());
        response.getWriter().write(jsonObject.toJSONString());
    }
}
