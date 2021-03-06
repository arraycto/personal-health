package com.jiu.calculate;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author liaoyj
 * @date 2020-10-21
 **/
@EnableDubbo
@MapperScan(basePackages = "com.jiu.calculate.mapper")
@SpringBootApplication
public class CalculateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateApplication.class, args);
    }

}
