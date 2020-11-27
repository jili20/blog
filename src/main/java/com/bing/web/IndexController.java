package com.bing.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bing  @create 2020/11/26-下午10:10
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

//    测试异常处理
//    @GetMapping("/")
//    public String index() {
//         int i = 9/0;
//        return "index";
//    }

//    测试异常处理
//    @GetMapping("/")
//    public String index() {Ò
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("博客不存在");
//        }
//        return "index";
//    }

    //    测试日志处理
//    @GetMapping("/{id}/{name}")
//    public String index(@PathVariable Integer id,@PathVariable String name) {
//        System.out.println("======= index =======");
//        return "index";
//        // 访问 http://blog.com/3/aaa  返回首页
//    }
}
