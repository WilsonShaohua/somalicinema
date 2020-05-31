package com.xhu.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.xhu.po.MoviePo;
import com.xhu.service.MoviePoService;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liu li
 * @date 2020/5/31 9:56
 */
public class MoviePoServiceImplTest extends SpringTest {
    @Autowired
    private MoviePoService poService;

    @Test
    public void findMoviePoByMovie() {
        MoviePo moviePo = poService.findMoviePoByMovieId("1001001001");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("moviePo", moviePo);
        String str = jsonObject.toJSONString();
        System.out.println(str);
    }
}