package com.xhu.service;

import com.xhu.po.Fun;
import com.xhu.po.StateLife;

import java.util.List;

/**
 * 生活状态服务
 * @author liu li
 * @date 2020/5/26 16:48
 */
public interface StateLiftService {
    List<StateLife> selectAllStateLife();
    int insertStateLift(StateLife stateLife);
    int delteStateLifeByStateLifeId(String stateLifeId);
    int updateStateLife(StateLife stateLife);
}
