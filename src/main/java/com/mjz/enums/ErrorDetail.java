package com.mjz.enums;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public enum ErrorDetail {
    SYSTEM_ERROR("999999", "系统错误"),;

    /** The code. */
    private String errorCode;

    /** The message. */
    private String errorMsg;

    /**
     * Instantiates a new error detail.
     *
     * @param errorCode the code
     * @param errorMsg the message
     */
    private ErrorDetail(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Resolve.
     *
     * @param code the code
     * @return the error detail
     */
    public static ErrorDetail resolve(String code) {
        for (ErrorDetail item : values()) {
            if (item.getErrorCode().equalsIgnoreCase(code)) {
                return item;
            }
        }
        return null;
    }
}
