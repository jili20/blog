package com.bing.service;

import com.bing.po.User;

/**
 * @author bing  @create 2020/11/27-4:58 下午
 */
public interface UserService {
    User checkUser(String username, String password);
}

