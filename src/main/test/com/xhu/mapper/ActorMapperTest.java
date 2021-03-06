package com.xhu.mapper;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import com.xhu.po.ActorExample;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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