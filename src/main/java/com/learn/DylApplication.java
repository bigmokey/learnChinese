package com.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.learn.dao")
public class DylApplication {

    public static void main(String[] args) {
        SpringApplication.run(DylApplication.class, args);
    }

}
