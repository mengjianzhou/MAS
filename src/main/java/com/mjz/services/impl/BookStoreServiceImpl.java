package com.mjz.services.impl;

import com.mjz.entities.Acct;
import com.mjz.entities.Book;
import com.mjz.enums.ErrorDetail;
import com.mjz.exception.BusinessException;
import com.mjz.mapper.AcctMapper;
import com.mjz.mapper.BookMapper;
import com.mjz.services.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/18
 */
@Service
public class BookStoreServiceImpl implements BookStoreService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AcctMapper acctMapper;

    @Override
    public void add(String id, String name, String price) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setPrice(new BigDecimal(price));
        bookMapper.addBook(book);
    }

    @Override
    public Book query(String id) {
        Book book = bookMapper.queryBook(id);
        return book;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void buyBook(String id) throws Exception {
        bookMapper.updateBook(id);
        Book book = bookMapper.queryBook(id);
        BigDecimal bookPrice = book.getPrice();
        Acct acct = acctMapper.queryAcct("1");
        if(acct.getAmount().compareTo(bookPrice)<0){
            throw new BusinessException(ErrorDetail.SYSTEM_ERROR.AMOUNT_NOT_ENOUGH);
        }
        acct.setAmount(bookPrice);
        acctMapper.updateAcct(acct);
    }
}
