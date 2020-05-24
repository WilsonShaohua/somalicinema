package com.xhu.mapper;

import com.alibaba.fastjson.JSON;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import com.xhu.po.Actor;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * @author liu li
 * @date 2020/5/24 8:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/application.xml","classpath:spring/spring-mvc.xml"})
public class ActorMapperTest extends SpringTest {
    @Autowired
    private ActorMapper actorMapper;

    @Test
    public void countByExample() {

    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
        Actor actor = actorMapper.selectByPrimaryKey("1000000001");
        String s =  JSON.toJSON(actor).toString();
        System.out.println(s);
        Actor actor1 = JSON.parseObject(s,Actor.class);
        System.out.println(actor1);
    }

    @Test
    public void updateByExampleSelective() {

    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }


}