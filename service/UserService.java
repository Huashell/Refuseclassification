package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.User;

public interface UserService {
    //检查用户是否已经存在，若存在则返回，不存在则注册
    Boolean loginOrRegister(User user);
}
