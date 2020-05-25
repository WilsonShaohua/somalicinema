package com.xhu.utils;

import lombok.Data;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author liu li
 * @date 2020/5/24 8:07
 * spring测试父类
 * 在测试spring组件的类需要继承该类
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/application.xml","classpath:spring/spring-mvc.xml"})
public class SpringTest
{
    protected final static Logger log = LoggerFactory.getLogger(SpringTest.class);
}
