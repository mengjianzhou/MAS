package com.mjz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@MapperScan(value="com.mjz.mapper")
@SpringBootApplication
@EnableCaching
public class MASApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MASApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
