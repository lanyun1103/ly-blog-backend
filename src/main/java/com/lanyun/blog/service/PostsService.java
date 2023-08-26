package com.lanyun.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lanyun.blog.common.BizPage;
import com.lanyun.blog.model.Posts;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author lanyun
* @description 针对表【posts】的数据库操作Service
* @createDate 2023-08-26 01:14:04
*/
public interface PostsService extends IService<Posts> {
    public Page<Posts> selectByPages(Page<Posts> page);
}
