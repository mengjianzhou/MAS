package com.mengjianzhou.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/20
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .excludePathPatterns("/index.html","/login","/user/login","/asserts/**");
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/asserts/**").addResourceLocations("classpath:/asserts/");
    }
}
