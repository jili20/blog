package com.bing.dao;

import com.bing.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bing  @create 2020/11/27-11:20 下午
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}