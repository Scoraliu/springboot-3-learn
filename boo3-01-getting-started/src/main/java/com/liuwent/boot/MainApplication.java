package com.liuwent.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lwt
 * @Description 启动SpringBoot项目的主入口程序
 */

@SpringBootApplication //注解，这个注解的作用是，告诉程序，这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        //SpringBoot应用的启动代码
        SpringApplication.run(MainApplication.class, args);
    }
}
