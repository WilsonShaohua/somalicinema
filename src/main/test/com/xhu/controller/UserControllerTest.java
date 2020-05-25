package com.xhu.controller;

import com.xhu.po.User;
import com.xhu.utils.SpringTest;
import org.junit.Test;

/**
 * @author liu li
 * @date 2020/5/25 11:11
 */
public class UserControllerTest extends SpringTest {

    @Test
    public void NULL() {
        User user = new User();
        System.out.println(user.getUserTelphone());

    }
}
