package com.huqingshan.LenMore.model.result;

import lombok.Data;

/**
 * 对返回结果进行封装
 * @param <T>
 */
@Data
public class BaseResult<T> {

    private T data;
    private String message;
    private int status;

    public BaseResult(T data,String message,int status){
       this.data = data;
       this.message = message;
       this.status = status;
    }

    public static <T> BaseResult<T> ok(T data,String mes,int status){
        return new BaseResult<>(data,mes,status);
    }

    public static <T> BaseResult<T> fail(T data,String mes,int status){
        return new BaseResult<>(data,mes,status);
    }

}
