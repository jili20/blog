package com.bing.service;

import com.bing.po.Comment;

import java.util.List;

/**
 * @author bing  @create 2020/11/29-12:45 下午
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}

