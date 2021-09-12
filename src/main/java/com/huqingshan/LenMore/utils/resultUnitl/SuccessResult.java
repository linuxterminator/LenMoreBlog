package com.huqingshan.LenMore.utils.resultUnitl;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 成功result
 * @param <T>
 */
@Data
public class SuccessResult<T> {

    private T data;
    private HttpStatus code;
    private String message;


//    public Result<T>(T data,int code,String message){
//    上面这种写法为什么是错的
    public SuccessResult(T data, HttpStatus code, String message){
        this.data = data;
        this.code = code;
        this.message = message;
    }

//    同时，注意静态方法范性的写法
    public static <T> SuccessResult<T> success(T data, HttpStatus code, String message){
        return new SuccessResult<>(data,code,message);
    }
}
