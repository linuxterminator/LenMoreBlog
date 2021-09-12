package com.huqingshan.LenMore.core;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 日期切面
 */

@Aspect
@Component
@Log4j2
public class LogAop {

    @Pointcut("execution(* com.huqingshan.LenMore.controller.api.ArticleController.getArticles(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){

    }

    @After("pointCut()")
    public void after(){
        System.out.println("after");
    }
}
