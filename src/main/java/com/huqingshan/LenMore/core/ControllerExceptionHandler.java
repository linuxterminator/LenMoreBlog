package com.huqingshan.LenMore.core;

import com.huqingshan.LenMore.utils.result.ErrorInfo;
import com.huqingshan.LenMore.utils.result.ErrorResult;
import com.huqingshan.LenMore.utils.MybatisException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.List;

/**
 * 统一错误处理类，用来处理自定义异常
 */

//@RestControllerAdvice(basePackages = {"com.huqingshan.LenMore.controller.*"})
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MybatisException.class)
    public ErrorResult mybatisExceptionHandler(MybatisException mybatisException){
        List<ErrorInfo> errorInfoList = new ArrayList<>();
        errorInfoList.add(new ErrorInfo(null,null,null));
        return new ErrorResult(HttpStatus.NOT_FOUND,mybatisException.getMessage(),errorInfoList);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public void ValidExceptionHandler(MethodArgumentNotValidException methodArgumentNotValidException){
        System.out.println(methodArgumentNotValidException.getMessage());
        System.out.println("参数验证异常");
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public void validTypeHandle(){
       System.out.println("参数类型错误");
    }
}
