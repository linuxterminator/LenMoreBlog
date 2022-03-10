package com.huqingshan.LenMore.utils.CustomException;

import org.aspectj.weaver.ast.Not;

/**
 * 数据未找到异常
 */
public class NotFoundException extends RuntimeException{

    public NotFoundException(String message){
        super(message);
    }
}
