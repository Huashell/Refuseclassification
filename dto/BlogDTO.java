package com.tencent.wxcloudrun.dto;

import lombok.Data;

/**
 * ClassName:$(NAME)
 * data: 2021/3/3
 * author: hky
 * Description: 返回给前端的博客对象
 */
@Data
public class BlogDTO {

    private Integer id;

    private String title;

    private String content;
}
