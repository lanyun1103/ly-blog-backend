package com.lanyun.blog.dao;

import com.lanyun.blog.model.Posts;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author lanyun
* @description 针对表【posts】的数据库操作Mapper
* @createDate 2023-08-26 01:14:04
* @Entity com.lanyun.blog.model.Posts
*/
@Mapper
public interface PostsMapper extends BaseMapper<Posts> {

}




