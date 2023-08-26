package com.lanyun.blog.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName posts
 */
@Data
public class Posts {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String content;

    /**
     *
     */
    private Date pubDate;
}