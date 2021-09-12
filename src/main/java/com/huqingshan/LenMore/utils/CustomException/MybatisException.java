package com.huqingshan.LenMore.utils.CustomException;

/**
 * 运行时异常编译器不检查
 */
public class MybatisException extends RuntimeException{

    public MybatisException(String errorMessage){
        super(errorMessage);
    }

}
