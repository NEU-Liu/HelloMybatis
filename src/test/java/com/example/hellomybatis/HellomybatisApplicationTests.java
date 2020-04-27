package com.example.hellomybatis;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class HellomybatisApplicationTests {

    @Autowired
    DataSource dataSource = null;

    @Test
    void contextLoads() throws Exception {
        System.out.println(dataSource.getConnection());
    }

}
