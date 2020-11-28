package com.bing.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/** 标签
 * @author bing  @create 2020/11/27-3:59 下午
 */
@Data
@ToString
@NoArgsConstructor
@Entity(name = "t_tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();
}
