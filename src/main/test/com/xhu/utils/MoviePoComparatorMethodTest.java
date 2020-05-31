package com.xhu.utils;

import com.xhu.po.MoviePo;
import com.xhu.utils.constant.MovieInformationComparatorMethod;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/30 19:51
 */
public class MoviePoComparatorMethodTest extends SpringTest {
    @Test
    public void hot() {
        Comparator<MoviePo> comparable = MovieInformationComparatorMethod.HOT_MOVIE;
        List<MoviePo> moviePoList = new ArrayList<MoviePo>();
        moviePoList.sort(comparable);
    }

}