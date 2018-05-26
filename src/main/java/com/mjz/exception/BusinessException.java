package com.mjz.exception;

import com.mjz.enums.ErrorDetail;

import java.text.MessageFormat;


public class BusinessException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String errorMsg;
	String errorCode;
	
	public BusinessException(){
		super();
	}
	
	public BusinessException(String errorCode, String errorMsg){
		super();
		
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		
	}
	
	public BusinessException(ErrorDetail e){
		super();
		
		this.errorCode = e.getErrorCode();
		this.errorMsg = e.getErrorMsg();
	}

	public BusinessException(ErrorDetail e, String[] params){
		super();
		this.errorCode = e.getErrorCode();
		String errorMsg = e.getErrorMsg();
		this.errorMsg = MessageFormat.format(errorMsg, params);
	}

	public String getErrorMsg(){
		return errorMsg;
	}
	
	public String getErrorCode(){
		return errorCode;
	}
	
}
