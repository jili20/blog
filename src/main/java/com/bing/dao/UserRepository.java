package com.bing.dao;

import com.bing.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bing  @create 2020/11/27-5:03 下午
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
