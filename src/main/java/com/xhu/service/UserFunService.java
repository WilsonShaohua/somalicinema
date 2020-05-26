package com.xhu.service;

import com.xhu.po.Fun;

import java.sql.SQLException;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 15:32
 */
public interface UserFunService {
    /**
     * 通过用户id查找该用户的兴趣
     * @param userId
     * @return
     */
    public List<Fun> findFunByUserId(String userId);


    /**
     * 删除该用户的UserFun中的数据
     * @param userId
     * @return
     */
    public int deleteUserFunByUserId(String userId);

    /**
     * 给用户添加兴趣
     * @param userId
     * @param funIds
     * @return
     */
    public int addUserFunByUserIdWithFunIds(String userId, List<String> funIds) throws SQLException;

    public int addUserFunByUserIdWithFuns(String userId, List<Fun> funs) throws SQLException;
}
