package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
        List<Book> mySelect();
        Book mySelectId(int Id);
        int myInsert(Book book);
        int myUpdate(Book book);
        int myDelete(int Id);
}
