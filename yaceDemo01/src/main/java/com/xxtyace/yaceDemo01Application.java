package com.xxtyace;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.xxtyace.Mapper")
public class yaceDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(yaceDemo01Application.class, args);
        System.out.println("yaceDemo01Application-------------");
    }
}