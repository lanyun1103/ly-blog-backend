package com.lanyun.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lanyun.blog.common.BizPage;
import com.lanyun.blog.model.Posts;
import com.lanyun.blog.service.PostsService;
import com.lanyun.blog.dao.PostsMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
* @author lanyun
* @description 针对表【posts】的数据库操作Service实现
* @createDate 2023-08-26 01:14:04
*/
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts>
    implements PostsService{

    @Resource
    PostsMapper postsMapper;
    @Override
    public Page<Posts> selectByPages(Page<Posts> page) {
        LambdaQueryWrapper<Posts> wrapper = new LambdaQueryWrapper<>();
        return postsMapper.selectPage(page, wrapper);
    }
}




