package com.lanyun.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lanyun.blog.common.BizPage;
import com.lanyun.blog.model.Posts;
import com.lanyun.blog.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class BlogController {
    private static final int PAGE_SIZE = 20;
    private final PostsService postsService;

    public BlogController(PostsService postsService) {
        this.postsService = postsService;
    }

    @GetMapping("/get-all/{current}")
    public Page<Posts> getPosts(@PathVariable int current){
        return postsService.selectByPages(new Page<>(current, 20));
    }
}
