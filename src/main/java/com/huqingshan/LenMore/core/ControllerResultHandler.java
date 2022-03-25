package com.huqingshan.LenMore.core;

import com.huqingshan.LenMore.model.result.BaseResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 对controller的返回值进行统一封装
 *
 * 对String需要特殊处理
 */
@RestControllerAdvice
public class ControllerResultHandler implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        if(body instanceof BaseResult){
            return body;
        }
        else if(body instanceof String){
           return body;
        }
        else{
            return BaseResult.ok(body,HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value());
        }
    }
}
