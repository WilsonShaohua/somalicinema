package com.xhu.utils.constant;

import com.xhu.utils.SpringTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author liu li
 * @date 2020/6/2 11:51
 */
public class SplitCharConstantTest extends SpringTest {
    @Test
    public void testSplit() {
        String test = "张 三|丰$李，达。康";
        System.out.println(SplitCharConstant.SPLIT_CHARS);
        String[] str = test.split(SplitCharConstant.SPLIT_CHARS);
        for (String s : str) {
            System.out.println(s);
        }
    }

}