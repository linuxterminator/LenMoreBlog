package com.huqingshan.LenMore.core;

import com.huqingshan.LenMore.model.result.BaseResult;
import com.huqingshan.LenMore.utils.CustomException.AlreadyExistsException;
import com.huqingshan.LenMore.utils.CustomException.MybatisException;
import com.huqingshan.LenMore.utils.CustomException.NotFoundException;
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

@RestControllerAdvice
public class ControllerExceptionHandler<T> {

    @ExceptionHandler(MybatisException.class)
    public BaseResult<String> mybatisExceptionHandler(MybatisException mybatisException){
        return BaseResult.fail(mybatisException.getMessage(),null,HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(NotFoundException.class)
    public BaseResult<String> NotFounDException(NotFoundException notFoundException){
        return BaseResult.fail(notFoundException.getMessage(),null,400);
    }

    @ExceptionHandler(AlreadyExistsException.class)
    public BaseResult<String> AlreadyExistsException(AlreadyExistsException alreadyExistsException){
        return BaseResult.fail(alreadyExistsException.getMessage(),null,400);
    }

    /**
     * RequestBody验证错误处理
      * @param methodArgumentNotValidException
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResult<Map<String,String>> ValidExceptionHandler(MethodArgumentNotValidException methodArgumentNotValidException){

        Map<String,String> errorMap = ErrorToMap.getBindExceptionMap(methodArgumentNotValidException);
        return BaseResult.fail(errorMap,"RequestBody验证错误",0);
    }

    /**
     * 请求类型异常处理
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public BaseResult<String> validTypeHandle(){
        return BaseResult.fail("请求类型异常",null,0);
    }

    /**
     * get请求异常处理
     * 获取被处理成map的错误信息并封装
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public BaseResult<Map<String,String>> validParamHandle(ConstraintViolationException constraintViolationException){

        List<String> list = new ArrayList<>();
        /**
         * 为什么这里是问号也行。。。
         */
        Set<ConstraintViolation<?>> set = constraintViolationException.getConstraintViolations();

            for(ConstraintViolation<?> constraintViolation : set){
                list.add(constraintViolation.getMessage());
            }

        Map<String,String> errorMap = ErrorToMap.getConstrainValionsErrorMap(constraintViolationException);

        return BaseResult.fail(errorMap,"get请求异常处理",0);
    }
}
