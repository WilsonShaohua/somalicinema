package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/27 11:15
 * 电影信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieInformation {
    private Movie movie;
    private List<Actor> actors;
    private City city;
    private MovieType movieType;
}
