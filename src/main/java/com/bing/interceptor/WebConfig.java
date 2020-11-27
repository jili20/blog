package com.bing.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** 拦截的内容
 * @author bing  @create 2020/11/27-7:39 下午
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                // 拦截
                .addPathPatterns("/admin/**")
                // 排除
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");
    }
}

