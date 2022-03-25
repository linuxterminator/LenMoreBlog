package com.huqingshan.LenMore.utils.CustomException;

/**
 * mybatis异常
 */
public class MybatisException extends RuntimeException{

    public MybatisException(String errorMessage){
        super(errorMessage);
    }

}
