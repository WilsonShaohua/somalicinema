package com.xhu.service.imp;

import com.xhu.mapper.FunMapper;
import com.xhu.mapper.UserFunMapper;
import com.xhu.po.Fun;
import com.xhu.po.FunExample;
import com.xhu.po.UserFun;
import com.xhu.po.UserFunExample;
import com.xhu.service.UserFunService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 15:37
 */
@Service
public class UserFunServiceImpl implements UserFunService {
    @Autowired
    private UserFunMapper userFunMapper;
    @Autowired
    private FunMapper funMapper;
    private UserFunExample userFunExample = new UserFunExample();
    private UserFunExample.Criteria criteria = userFunExample.createCriteria();

    @Override
    public List<Fun> findFunByUserId(String userId) {
        if (null == userId) return null;
        //添加用户id查询条件
        criteria.andUserIdEqualTo(userId);
        //查找用户的全部兴趣
        List<UserFun> userFuns = userFunMapper.selectByExample(userFunExample);
        if( null == userFuns) return null;
        //创建funExample对象查找fun数据
        FunExample funExample = new FunExample();
        FunExample.Criteria funExampleCriteria = funExample.createCriteria();
        List<String> fundIds = new ArrayList<>();
        for (UserFun item : userFuns) {
            fundIds.add(item.getFunId());
        }

        //将funIds添加进查询条件
        funExampleCriteria.andFunIdIn(fundIds);
        //查找兴趣对象集合
        List<Fun> funs = funMapper.selectByExample(funExample);
        //返回对象
        return funs;
    }

    @Override
    public int deleteUserFunByUserId(String userId) {
        if (null == userId) return StateCode.SUCCESS;
        //添加用户id查询条件
        criteria.andUserFunIdEqualTo(userId);
        //删除操作，返回1表示删除完成
        int res = userFunMapper.deleteByExample(userFunExample);
        //删除完成，返回状态码成功
        if (res == 1) return StateCode.SUCCESS;
        //返回状态码失败
        return StateCode.FAIL;
    }

    @Override
    public int addUserFunByUserIdWithFuns(String userId, List<Fun> funs) throws SQLException {
        List<String> funIds = new ArrayList<>();
        funIds.clear();
        for (Fun fun : funs) {
            funIds.add(fun.getFunId());
        }
        return addUserFunByUserIdWithFunIds(userId, funIds);
    }

    /**
     * 抛出slq异常，表示数据库的用户id或者funId不存在。
     *
     * @param userId
     * @param funIds
     * @return
     * @throws SQLException
     */
    @Override
    public int addUserFunByUserIdWithFunIds(String userId, List<String> funIds) throws SQLException {
        UserFun userFun = null;
        int res = 0;
        String key = null;
        for (String funId : funIds) {
            //查询用户该兴趣是否存在
            UserFunExample userFunExample1 = new UserFunExample();
            UserFunExample.Criteria criteria1 = userFunExample1.createCriteria();
            criteria1.andUserIdEqualTo(userId);
            criteria1.andFunIdEqualTo(funId);
            //如果存在则跳过；
            if(userFunMapper.countByExample(userFunExample1) == 1){
                res++;
                continue;
            }
            key = KeyProductor.getKey();
            userFun = new UserFun(key, userId, funId);
            res += userFunMapper.insert(userFun);
        }
        if (res == funIds.size()) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }
}
