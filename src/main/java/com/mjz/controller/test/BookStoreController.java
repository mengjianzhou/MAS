package com.mjz.controller.test;

import com.mjz.controller.BaseController;
import com.mjz.entities.Book;
import com.mjz.enums.ErrorDetail;
import com.mjz.exception.BusinessException;
import com.mjz.model.BaseResponseData;
import com.mjz.services.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/18
 */
@RestController
@RequestMapping("bookStore")
public class BookStoreController  extends BaseController {

    @Autowired
    private BookStoreService bookStoreService;

    @RequestMapping("add/{id}/{name}/{price}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> addBook(@PathVariable("id") String id,
                                                    @PathVariable("name") String name,
                                                    @PathVariable("price") String price ){
        bookStoreService.add(id, name, price);
        return success(true);
    }

    @RequestMapping("query/{id}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> queryBook(@PathVariable("id") String id){
        Book book = bookStoreService.query(id);
        return success(book);
    }

    @RequestMapping("buyBook/{id}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> buyBook(@PathVariable("id") String id){
        try {
            bookStoreService.buyBook(id);
            return success(true);
        } catch (Exception e) {
            if(e instanceof BusinessException){
                BusinessException be = (BusinessException) e;
                return fail(be.getErrorCode(), be.getErrorMsg(), be.getCause());
            }
            logger.error(e.getMessage());
            e.printStackTrace();
            return fail(ErrorDetail.SYSTEM_ERROR.getErrorCode(), ErrorDetail.SYSTEM_ERROR.getErrorMsg(), e.getCause());
        }

    }



}
