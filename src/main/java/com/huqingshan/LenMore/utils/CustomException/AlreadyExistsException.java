package com.huqingshan.LenMore.utils.CustomException;

/**
 * 已存在异常
 */
public class AlreadyExistsException extends RuntimeException{

    public AlreadyExistsException(String message){
        super(message);
    }

}
