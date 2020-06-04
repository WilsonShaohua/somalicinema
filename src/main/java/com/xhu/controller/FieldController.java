package com.xhu.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liu li
 * @date 2020/6/4 14:27
 */
@Slf4j
@Api
@Controller
@RequestMapping(value = "/field")
public class FieldController {
    public void dateMovieCinemaInfo(HttpServletRequest request, HttpServletResponse response) {

    }
}
