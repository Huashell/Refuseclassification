package com.tencent.wxcloudrun.repository;

import com.tencent.wxcloudrun.dto.BlogDTO;
import com.tencent.wxcloudrun.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


/**
 * ClassName:$(NAME)
 * data: 2022/3/3
 * author: hky
 * Description:调用sql
 */

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    @Transactional
    @Query(value = "select title from Blog where blog.id = ?1",nativeQuery = true)
    String getTitle(Integer id);

    @Transactional
    @Query(value = "select content from Blog where blog.id = ?1",nativeQuery = true)
    String getContent(Integer id);

}