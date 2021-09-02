package com.huqingshan.LenMore.utils;

//注意，该result仅仅只是测试使用
public class Result<T> {
    private T data;
    private int code;
    private String message;


//    public Result<T>(T data,int code,String message){
//    上面这种写法为什么是错的
    public Result(T data,int code,String message){
        this.data = data;
        this.code = code;
        this.message = message;
    }

//    同时，注意静态方法范性的写法
    public static <T> Result<T> success(T data, int code, String message){
        return new Result<>(data,code,message);
    }

    public static <T> Result<T> failure(T data,int code,String message){
        return new Result<>(data,code,message);
    }
}
