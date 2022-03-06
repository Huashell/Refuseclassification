package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dto.BlogDTO;
import com.tencent.wxcloudrun.repository.BlogRepository;
import com.tencent.wxcloudrun.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:$(NAME)
 * data: 2022/3/3
 * author: hky
 * Description: 博客接口实现类
 */
@Service
public class BlogImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public String getTitle(Integer id){
        return blogRepository.getTitle(id);
    }

    @Override
    public String getContent(Integer id) {
        return blogRepository.getContent(id);
    }


}
