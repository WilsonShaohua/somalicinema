package com.xhu.service.imp;

import com.xhu.mapper.StateLifeMapper;
import com.xhu.po.StateLife;
import com.xhu.po.StateLifeExample;
import com.xhu.service.StateLiftService;
import com.xhu.utils.constant.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 16:51
 */
@Service
public class StateLiftServiceImpl implements StateLiftService {
    @Autowired
    private StateLifeMapper stateLifeMapper;

    @Override
    public List<StateLife> selectAllStateLife() {
        StateLifeExample stateLifeExample = new StateLifeExample();
        return stateLifeMapper.selectByExample(stateLifeExample);
    }

    @Override
    public int insertStateLift(StateLife stateLife) {
        int res = stateLifeMapper.insert(stateLife);
        if (res == 1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }

    @Override
    public int delteStateLifeByStateLifeId(String stateLifeId) {
        int res = stateLifeMapper.deleteByPrimaryKey(stateLifeId);
        if (res == 1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }

    @Override
    public int updateStateLife(StateLife stateLife) {
        int res = stateLifeMapper.updateByPrimaryKey(stateLife);
        if (res == 1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }

    @Override
    public StateLife selectStateLifeByPrimartKey(String stateLifeId) {
        return stateLifeMapper.selectByPrimaryKey(stateLifeId);
    }
}
