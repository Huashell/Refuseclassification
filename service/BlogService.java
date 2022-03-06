package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dto.BlogDTO;
import com.tencent.wxcloudrun.entity.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:$(NAME)
 * data: 2022/3/3
 * author: hky
 * Description: 博客接口
 */
@Service
public interface BlogService {

    String  getTitle(Integer id);

    String getContent(Integer id);
}
