package com.example.hellomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.example.hellomybatis.mapper")
public class HellomybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellomybatisApplication.class, args);
    }

}
