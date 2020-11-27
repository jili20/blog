package com.bing.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/** 分类
 * @author bing  @create 2020/11/27-3:47 下午
 */
@Data
@ToString
@NoArgsConstructor
@Entity(name = "t_type")
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}