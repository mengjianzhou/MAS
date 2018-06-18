package com.mjz.services;

import com.mjz.entities.Book;

/**
 *  书店<br>
 *
 * @author zhaob
 * @create 2018/6/18
 */
public interface BookStoreService {

    void add(String id, String name, String price);

    Book query(String id);

    void buyBook(String id) throws Exception;
}
