package com.xhu.service.imp;

import com.xhu.mapper.FunMapper;
import com.xhu.po.Fun;
import com.xhu.po.FunExample;
import com.xhu.service.FunService;
import com.xhu.utils.constant.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 16:43
 */
@Service
public class FunServiceImpl implements FunService {
    @Autowired
    private FunMapper funMapper;


    @Override
    public List<Fun> selectAllFun() {
        FunExample funExample = new FunExample();
        return funMapper.selectByExample(funExample);
    }

    @Override
    public int insertFun(Fun fun) {
        int res = funMapper.insert(fun);
        if (res == 1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }

    @Override
    public int delteFunByFunId(String funId) {
        int res = funMapper.deleteByPrimaryKey(funId);
        if (res == 1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }

    @Override
    public int updateFun(Fun fun) {
        int res = funMapper.updateByPrimaryKey(fun);
        if (res == 1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }
}
