package com.huqingshan.LenMore.utils.resultUnitl;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 错误result对象
 */

@Data
public class ErrorResult<T> {
    private HttpStatus code;
    private String message;
    private T messageList;

    public ErrorResult(HttpStatus code,String message,T messageList){
        this.code = code;
        this.message = message;
        this.messageList = messageList;
    }

    public static <T> ErrorResult<T> builder(HttpStatus code,String message,T messageList){
        return new ErrorResult<>(code,message,messageList);
    }
}
