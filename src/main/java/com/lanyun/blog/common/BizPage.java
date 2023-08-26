package com.lanyun.blog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BizPage<T> {
    public int current;
    public int size;
    public List<T> records;
}
