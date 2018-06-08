package com.mjz.controller;

import com.mjz.enums.ErrorDetail;
import com.mjz.exception.BusinessException;
import com.mjz.model.BaseResponseData;
import com.mjz.model.request.AccountRequest;
import com.mjz.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户
 *
 * @author zhaob
 * @create 2018/6/9
 */
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {

    @Autowired
    private AccountService accountService;

    @GetMapping("addAccount")
    @ResponseBody
    public ResponseEntity<BaseResponseData> addAccount(AccountRequest accountRequest){
        try {
            accountService.addAccount(accountRequest);
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

}
