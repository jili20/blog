package com.bing.dao;

import com.bing.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bing  @create 2020/11/27-8:13 下午
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);
}