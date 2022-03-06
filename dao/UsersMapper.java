package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {
    //按id获取用户
    User getUser(@Param("open_id") String open_id);
    //将user存入数据库
    void upsertUser(User user);
}
