package com.bing.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author bing  @create 2020/11/28-11:10 上午
 */
@Data
@NoArgsConstructor
public class BlogQuery {
    private String title; //
    private Long typeId;
    private boolean recommend;
}
