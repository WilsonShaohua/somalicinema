package com.xhu.mapper;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author liu li
 * @date 2020/5/24 8:05
 */

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
        System.out.println(JSON.toJSON(actor));
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