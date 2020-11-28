package com.bing.service;

import com.bing.po.Blog;
import com.bing.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/**
 * @author bing  @create 2020/11/28-9:13 上午
 */
public interface BlogService {
    Blog getBlog(Long id);
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id,Blog blog);
    void deleteBlog(Long id);
}
