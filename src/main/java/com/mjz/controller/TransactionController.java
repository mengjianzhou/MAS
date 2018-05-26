package com.mjz.controller;

import com.mjz.enums.ErrorDetail;
import com.mjz.exception.BusinessException;
import com.mjz.model.BaseResponseData;
import com.mjz.model.TransactionVo;
import com.mjz.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
@RestController
@RequestMapping("/trans")
public class TransactionController extends BaseController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("addTrans")
    @ResponseBody
    public ResponseEntity<BaseResponseData> addTrans(TransactionVo transactionVo){
        try {
            transactionService.addTransaction(transactionVo);
            return success(true);
        } catch (Exception e){
            if(e instanceof BusinessException){
                BusinessException be = (BusinessException) e;
                return fail(be.getErrorCode(), be.getErrorMsg(), be.getCause());
            }
            logger.error(e.getMessage());
            e.printStackTrace();
            return fail(ErrorDetail.SYSTEM_ERROR.getErrorCode(), ErrorDetail.SYSTEM_ERROR.getErrorMsg(), e.getCause());
        }
    }

    @GetMapping("delTrans")
    @ResponseBody
    public ResponseEntity<BaseResponseData> delTrans(Integer id){
        try {
            transactionService.delTrans(id);
            return success(true);
        } catch (Exception e){
            if(e instanceof BusinessException){
                BusinessException be = (BusinessException) e;
                return fail(be.getErrorCode(), be.getErrorMsg(), be.getCause());
            }
            logger.error(e.getMessage());
            e.printStackTrace();
            return fail(ErrorDetail.SYSTEM_ERROR.getErrorCode(), ErrorDetail.SYSTEM_ERROR.getErrorMsg(), e.getCause());
        }
    }

    @GetMapping("queryAllTrans")
    @ResponseBody
    public ResponseEntity<BaseResponseData> queryAllTrans(){
        try {
            List<TransactionVo> voList = transactionService.queryAllTrans();
            return success(voList);
        } catch (Exception e){
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
