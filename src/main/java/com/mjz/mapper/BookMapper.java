package com.mjz.mapper;

import com.mjz.entities.Book;

/**
 * @author zhaob
 * @create 2018/6/18
 */
public interface BookMapper {

    void addBook(Book book);

    Book queryBook(String id);

    void updateBook(String id);
}
