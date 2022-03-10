package com.huqingshan.LenMore.utils.validationUtil;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.*;

/**
 * 把错误转换成map形式
 */
public class ErrorToMap {

    public ErrorToMap(){}

    /**
     *
     * ConstrainViolationException的错误转map
     * @param constraintViolations
     * @return
     */
    public static Map<String,String> getConstrainValionsErrorMap(ConstraintViolationException constraintViolations){

        Map<String,String> error_map = new HashMap<>();

        Set<ConstraintViolation<?>> set = constraintViolations.getConstraintViolations();

        if(set.isEmpty()){
            error_map = Collections.emptyMap();
            return error_map;
        }
        else{
            for(ConstraintViolation<?> var : set){
                error_map.put(var.getPropertyPath().toString(),var.getMessage());
            }
//        set.forEach(item->{});
            return error_map;
        }
    }

    /**
     * BindException的错误转map
     * @param bindException
     * @return
     */
    public static Map<String,String> getBindExceptionMap(BindException bindException){

        Map<String,String> error_map = new HashMap<>();
        List<FieldError> list = bindException.getBindingResult().getFieldErrors();

        if(list.isEmpty()){
           error_map = Collections.emptyMap();
           return error_map;
        }
        else{
            for(FieldError var : list){
                error_map.put(var.getField(),var.getDefaultMessage());
            }
//        list.forEach(item->{});
            return error_map;
        }
    }
}
