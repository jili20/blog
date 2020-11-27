package com.bing.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 博客
 * @author bing  @create 2020/11/27-3:21 下午
 */
@Data
@ToString
@NoArgsConstructor
@Entity(name = "t_blog")
public class Blog {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String firstPicture; // 首图
    private String flag; // 标记
    private Integer views; // 浏览器次数
    private boolean appreciation; // 是否开启赞赏
    private boolean shareStatement; // 是否声明转载
    private boolean commentabled; // 是否可评论
    private boolean published;// 是否发布
    private boolean recommend;// 是否推荐
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime; // 创建时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime; // 更新时间

    // 建立关系，是多对多，还是一对多
    @ManyToOne
    private Type type;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

}
