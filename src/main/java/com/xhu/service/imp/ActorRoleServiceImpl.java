package com.xhu.service.imp;

import com.xhu.mapper.ActorRoleMapper;
import com.xhu.po.ActorRole;
import com.xhu.po.ActorRoleExample;
import com.xhu.service.ActorRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/6/3 15:54
 */
@Service
public class ActorRoleServiceImpl implements ActorRoleService {
    @Autowired
    private ActorRoleMapper actorRoleMapper;

    @Override
    public List<ActorRole> selectAll() {
        return actorRoleMapper.selectByExample(new ActorRoleExample());
    }
}
