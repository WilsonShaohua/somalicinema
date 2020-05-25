package com.xhu.api;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author liu li
 * @date 2020/5/25 18:59
 * 该类实现跨域问题
 * 博客地址：https://blog.csdn.net/Smile_Miracle/article/details/76682385
 */
public class CorsConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/com/xhu/controller/**")
                .allowedOrigins("http:localhost:8080")
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE");
    }
}
