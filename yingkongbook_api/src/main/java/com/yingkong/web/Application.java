package com.yingkong.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lin
 * @description
 * @time 2021/7/13 下午 1:01
 */
@SpringBootApplication
@MapperScan("com.yingkong.core.dao")
@ComponentScan("com.yingkong")
/*1 packaging改为 war
 2 extends SpringBootServletInitializer 目的时打包成war可以直接不是到tomcat下面
 3   @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
*/
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
