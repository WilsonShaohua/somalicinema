package com.xhu.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
/**
 * @author liu li
 * @date 2020/5/23 21:15
 */

public class Md5Test {
    @Test
    public void testCommonsLang3(){
        System.out.println(DigestUtils.md5Hex("Wilson"));
    }
}
