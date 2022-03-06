package com.tencent.wxcloudrun.controller;

import com.alibaba.fastjson.JSONObject;

import com.tencent.wxcloudrun.config.WechatConfig;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class WeChatController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WechatConfig weChatConfig;

    //用code获取openid
    @PostMapping("/login/applets")
    public String appletsLogin(@RequestBody String code) {

        String url = "https://api.weixin.qq.com/sns/jscode2session?appid={appid}&secret={secret}&js_code={code}&grant_type=authorization_code";
        //String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+weChatConfig.getAppid()+"&secret="+ weChatConfig.getSecret()+"&js_code="+code+"&grant_type=authorization_code";
        //System.out.println(url);
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("appid", weChatConfig.getAppid());
        requestMap.put("secret", weChatConfig.getSecret());
        requestMap.put("code", code);
        System.out.println(code);


        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class,requestMap);
        JSONObject jsonObject = JSONObject.parseObject(responseEntity.getBody());
        String openId = null;
        System.out.println(jsonObject);
        openId = jsonObject.getString("openid");
        //String session_key=jsonObject.getString("session_key");
        return openId;

    }
}

