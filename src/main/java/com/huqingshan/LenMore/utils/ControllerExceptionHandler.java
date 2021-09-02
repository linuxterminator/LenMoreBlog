package com.huqingshan.LenMore.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = {"com.huqingshan.LenMore.*"})
public class ControllerExceptionHandler {
//    这样我们在controller里面就可以直接返回成功的结果，错误的结果都被处理了
//    如果我们使用try catch，我们也可以看到，return成功的结果是在try catch语句之外的
//    但是springboot帮我们处理了try catch


//    需要注意的是，该异常必须要是运行时异常
    @ExceptionHandler(MybatisException.class)
    public void mybatisExceptionHandler(){
        System.out.println("数据查询发生异常");
    }
}
