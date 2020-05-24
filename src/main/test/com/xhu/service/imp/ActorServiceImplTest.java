package com.xhu.service.imp;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import com.xhu.service.ActorService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liu li
 * @date 2020/5/24 12:51
 */
public class ActorServiceImplTest extends SpringTest {
    @Autowired
    private ActorService actorService;
    @Test
    public void addActor() {
        Actor actor = new Actor();
        int return_code = actorService.addActor(actor);
        System.out.println(return_code);
    }
    @Test
    public void selectActorByActorId(){
        Actor actor = actorService.selectActorById("2005247804");
        System.out.println(actor);
        System.out.println(JSON.toJSON(actor));
    }
}