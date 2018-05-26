package com.mjz.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public class DateTools {

    private static final String FORMAT1 = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrentDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT1);
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(formatter);
    }
}
