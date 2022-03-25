package com.huqingshan.LenMore.utils.core;

import javax.servlet.http.HttpServletRequest;

/**
 * servlet相关的类
 * 获取请求的ip地址
 */
public class RequestIPUtils {

    public static String getUserIP(){
        return "127.0.0.1";
    }

    public static String getIP(HttpServletRequest httpServletRequest){
        return httpServletRequest.getRemoteAddr();
    }
}
