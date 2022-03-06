package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.service.BlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:$(NAME)
 * data:
 * author:
 * Description:
 */

@RestController
@Slf4j
@Api(value = "博客接口",tags = {"博客接口"})
public class BlogController {

    @Autowired
    BlogService blogService;


    @PostMapping("/blog1")
    @ApiOperation(value = "获取厨余垃圾博客", notes = "获取厨余垃圾博客", httpMethod = "POST")
    public String getBlog1(){
        return blogService.getTitle(1)+blogService.getContent(1);
    }

    @PostMapping("/blog2")
    @ApiOperation(value = "获取可回收垃圾博客", notes = "获取可回收垃圾博客", httpMethod = "POST")
    public String getBlog2(){
        return blogService.getTitle(2)+blogService.getContent(2);
    }

    @PostMapping("/blog3")
    @ApiOperation(value = "获取其他垃圾博客", notes = "获取其他垃圾博客", httpMethod = "POST")
    public String getBlog3(){
        return blogService.getTitle(3)+blogService.getContent(3);
    }

    @PostMapping("/blog4")
    @ApiOperation(value = "获取有害垃圾博客", notes = "获取有害垃圾博客", httpMethod = "POST")
    public String getBlog4(){
        return blogService.getTitle(4)+blogService.getContent(4);
    }


}
