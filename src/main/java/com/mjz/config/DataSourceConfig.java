package com.mjz.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean =  new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String, String> initMap = new HashMap<>();
        initMap.put(StatViewServlet.PARAM_NAME_JMX_USERNAME,"admin");
        initMap.put(StatViewServlet.PARAM_NAME_JMX_PASSWORD,"123456");
        initMap.put("loginUsername", "admin");
        initMap.put("loginPassword", "123456");

        bean.setInitParameters(initMap);
        return bean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String, String> initMap = new HashMap<>();
        bean.setInitParameters(initMap);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
