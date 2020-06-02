package com.xhu.mapper;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import com.xhu.po.ActorExample;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author liu li
 * @date 2020/5/24 8:05
 */
public class ActorMapperTest extends SpringTest {
    @Autowired
    private ActorMapper actorMapper;

    private ActorExample actorExample = new ActorExample();

    private ActorExample.Criteria criteria = actorExample.createCriteria();
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
        Actor actor = new Actor(KeyProductor.getKey(),"110100000000","功夫演员","李小龙",true,new Date(1969,7,12));
        int returnCode = actorMapper.insertSelective(actor);
        System.out.println(returnCode);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
        Actor actor = actorMapper.selectByPrimaryKey("2005250494");
        if (actor == null){
            System.out.println("null");
            return;
        }
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