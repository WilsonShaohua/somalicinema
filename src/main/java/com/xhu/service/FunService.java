package com.xhu.service;

import com.xhu.po.Fun;

import java.util.List;

/**
 * 兴趣服务
 * @author liu li
 * @date 2020/5/26 16:42
 */
public interface FunService {
    List<Fun> selectAllFun();
    int insertFun(Fun fun);
    int delteFunByFunId(String funId);
    int updateFun(Fun fun);
}
