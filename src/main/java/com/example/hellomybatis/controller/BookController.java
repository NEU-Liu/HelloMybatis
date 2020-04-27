package com.example.hellomybatis.controller;

import com.example.hellomybatis.entity.Book;
import com.example.hellomybatis.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(value = "/")
    public String HelloMybatis() {
        System.out.println("<------------------------------>");
        int i = bookMapper.myDelete(1);
        Integer integer = new Integer(2);
        System.out.println("<==============================>");
        return i + "";
    }


}
