package com.mjz.model;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public class BaseResponseData {

    /** The success. */
    private boolean success;

    /** The error msg. */
    private String errorMsg;

    /** The error code. */
    private String errorCode;

    /** The data. */
    private Object data;

    /**
     * Instantiates a new base response data.
     *
     * @param data the data
     */
    public BaseResponseData(Object data){
        this.success = true;
        this.data = data;
    }

    /**
     * Instantiates a new base response data.
     *
     * @param errorCode the error code
     * @param errorMsg the error msg
     * @param data the data
     */
    public BaseResponseData(String errorCode, String errorMsg, Object data){
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * Checks if is success.
     *
     * @return true, if is success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the success.
     *
     * @param success the new success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets the error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the error msg.
     *
     * @param errorMsg the new error msg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     *
     * @param errorCode the new error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(Object data) {
        this.data = data;
    }
}
