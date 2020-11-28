package com.bing.dao;

import com.bing.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
/**
 * @author bing  @create 2020/11/27-8:13 下午
 */
public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);

    // enquiry types by passing in number of size
    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
