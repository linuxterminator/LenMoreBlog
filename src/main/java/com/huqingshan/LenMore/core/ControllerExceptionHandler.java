package com.huqingshan.LenMore.core;

import com.huqingshan.LenMore.utils.resultUnitl.ErrorResult;
import com.huqingshan.LenMore.utils.CustomException.MybatisException;
import com.huqingshan.LenMore.utils.validationUtil.ErrorToMap;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.validation.*;
import java.util.*;

/**
 * 统一错误处理类，用来处理自定义异常
 */

//@RestControllerAdvice(basePackages = {"com.huqingshan.LenMore.controller.*"})
@RestControllerAdvice
public class ControllerExceptionHandler<T> {

    @ExceptionHandler(MybatisException.class)
    public ErrorResult mybatisExceptionHandler(MybatisException mybatisException){
        return new ErrorResult(HttpStatus.NOT_FOUND,mybatisException.getMessage(),null);
    }

    /**
     * RequestBody验证错误处理
      * @param methodArgumentNotValidException
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResult<Map<String,String>> ValidExceptionHandler(MethodArgumentNotValidException methodArgumentNotValidException){

        Map<String,String> errorMap = ErrorToMap.getBindExceptionMap(methodArgumentNotValidException);
        return new ErrorResult<>(HttpStatus.BAD_REQUEST,"POST提交数据错误",errorMap);
    }

    /**
     * 请求类型异常处理
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ErrorResult<String> validTypeHandle(){
        return new ErrorResult<>(HttpStatus.BAD_REQUEST,"请求参数类型错误",null);
    }

    /**
     * get请求异常处理
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ErrorResult<Map<String,String>> validParamHandle(ConstraintViolationException constraintViolationException){

        //=======================

        List<String> list = new ArrayList<>();
        /**
         * 为什么这里是问号也行。。。
         */
        Set<ConstraintViolation<?>> set = constraintViolationException.getConstraintViolations();

            for(ConstraintViolation<?> constraintViolation : set){
                list.add(constraintViolation.getMessage());
            }
            //===================

        Map<String,String> errorMap = ErrorToMap.getConstrainValionsErrorMap(constraintViolationException);

        return new ErrorResult<>(HttpStatus.BAD_REQUEST,"GET请求参数验证错误",errorMap);
    }
}
