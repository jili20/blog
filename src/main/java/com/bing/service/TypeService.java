package com.bing.service;

import com.bing.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author bing  @create 2020/11/27-8:03 下午
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    Type updateType(Long id,Type type);

    void deleteType(Long id);
}
