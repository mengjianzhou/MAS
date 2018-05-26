package com.mjz.controller;


import com.mjz.model.BaseResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * The Class BaseController.
 */
public class BaseController {
	
	/** The logger. */
	public static Logger logger = LoggerFactory.getLogger(BaseController.class);


	/**
	 * Fail.
	 * @param errorCode the error code
	 * @param message the message
	 * @param data the data
	 * @return the response entity
	 */
	protected ResponseEntity<BaseResponseData> fail(String errorCode, String message, Object data) {
		logger.info("REST API business failure: "+ errorCode + ", " + message, data);
		BaseResponseData responseData = new BaseResponseData(errorCode, message, data);
		return new ResponseEntity<BaseResponseData>(responseData, HttpStatus.OK);
	}
	
	/**
	 * Success.
	 *
	 * @param data the data
	 * @return the response entity
	 */
	protected ResponseEntity<BaseResponseData> success(Object data) {
		if(data!=null){
			logger.info("REST API response: " + data.toString());
		}else{
			logger.info("REST API response: Empty Response.");
		}
	
		BaseResponseData responseData = new BaseResponseData(data);
		return new ResponseEntity<BaseResponseData>(responseData, HttpStatus.OK);
	}
	
	/**
	 * Error.
	 *
	 * @param errorCode the error code
	 * @param message the message
	 * @param data the data
	 * @return the response entity
	 */
	protected ResponseEntity<BaseResponseData> error(String errorCode, String message, Object data) {
		logger.error("REST API critical failure: "+ errorCode + ", " + message, data);
		BaseResponseData responseData = new BaseResponseData(errorCode, message, data);
		return new ResponseEntity<BaseResponseData>(responseData, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * Timeout.
	 *
	 * @param errorCode the error code
	 * @param message the message
	 * @param data the data
	 * @return the response entity
	 */
	protected ResponseEntity<BaseResponseData> timeout(String errorCode, String message, Object data) {
		logger.error("REST API timeout:" + errorCode + ", " + message, data);
		BaseResponseData responseData = new BaseResponseData(errorCode, message, data);
		return new ResponseEntity<BaseResponseData>(responseData, HttpStatus.GATEWAY_TIMEOUT);
	}

}
