package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.UsersMapper;
import com.tencent.wxcloudrun.model.User;
import com.tencent.wxcloudrun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UsersMapper usersMapper;
    @Override
    public Boolean loginOrRegister(User user) {
        User user1 = usersMapper.getUser(user.getOpen_id());
        if(user1==null){
            usersMapper.upsertUser(user);
            System.out.println("注册");
            return false;
        }

        return true;
    }
}
