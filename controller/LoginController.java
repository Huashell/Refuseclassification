package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.model.User;
import com.tencent.wxcloudrun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    UserService userService;
    /**
     * 用户登录，查找id是否在数据库中，不在则添加
     * @param user
     * @return API response json
     */
    @PostMapping(value = "/api/login")
    ApiResponse login(@RequestBody User user) {
        if(userService.loginOrRegister(user)){
            return ApiResponse.ok("login");
        }
        else{
            return ApiResponse.error("register");
        }
    }
}
