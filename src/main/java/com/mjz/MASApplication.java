package com.mjz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@MapperScan(value="com.mjz.mapper")
@SpringBootApplication
public class MASApplication {

    public static void main(String[] args) {
        SpringApplication.run(MASApplication.class, args);
    }

}
