package com.huqingshan.LenMore.core;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 日志切面
 * 输出请求日志和响应日志
 */

@Aspect
@Slf4j
@Component
public class LogAop {

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RestController)")
    public void printLog(){
    }

    @Around("printLog()")
    public Object usePrintLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        log.info("日志测试");
        return proceedingJoinPoint.proceed();
    }

    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void printOut(){}

    @After("printOut()")
    public void useAfterLog(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();
        printWebRequestLog(httpServletRequest);
    }

    public void printWebRequestLog(HttpServletRequest httpServletRequest){
        String url = httpServletRequest.getRequestURI();
        String method = httpServletRequest.getMethod();
        String requestIP = httpServletRequest.getRemoteAddr();
        log.info("请求url:[{}],请求方法method:[{}],客户端IP[{}]",url,method,requestIP);
    }

    public void printWebResponseLog(HttpServletRequest httpServletRequest){
        log.info("回复");
    }

}
