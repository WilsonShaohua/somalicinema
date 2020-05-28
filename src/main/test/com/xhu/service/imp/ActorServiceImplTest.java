package com.xhu.service.imp;

import com.xhu.po.Actor;
import com.xhu.service.ActorService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author liu li
 * @date 2020/5/25 9:53
 */
public class ActorServiceImplTest extends SpringTest {
    @Autowired
    ActorService actorService;
    @Test
    public void addActor() {
        System.out.println(actorService.addActor(new Actor(KeyProductor.getKey(),"110100000000","功夫演员","李小龙",true,null)));
    }

    @Test
    public void selectActorById() {
        Actor actor = actorService.selectActorById("2005251368");
        System.out.println(actor);
    }
}
