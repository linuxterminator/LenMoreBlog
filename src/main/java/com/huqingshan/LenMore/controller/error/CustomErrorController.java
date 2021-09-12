package com.huqingshan.LenMore.controller.error;

import com.huqingshan.LenMore.utils.resultUnitl.ErrorResult;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * error控制器
 * 只处理通用错误，自定义错误由@RestControllerAdvice处理
 */
@RestController
public class CustomErrorController extends AbstractErrorController {

    private HttpStatus httpStatus;
    private String domain;
    private String error_message;

    public CustomErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @GetMapping("/error")
    public ErrorResult error(HttpServletRequest httpServletRequest){

        httpStatus = getHttpStatus(httpServletRequest);
        domain = getErrorUrl(httpServletRequest);
        error_message = getErrorMessage(httpServletRequest);

        return new ErrorResult<>(httpStatus,"请求错误",null);
    }

    /**
     * 获取错误的状态码，来自AbstractErrorController
      * @param httpServletRequest
     * @return
     */
    public HttpStatus getHttpStatus(HttpServletRequest httpServletRequest){

        Integer error_code = (Integer)httpServletRequest.getAttribute("javax.servlet.error.status_code");

        if(error_code == null){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        else{
            try {
                return HttpStatus.valueOf(error_code);
            } catch (Exception exception) {
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }

    }

    /**
     * 获取错误的url
     * @param httpServletRequest
     * @return
     */
    public String getErrorUrl(HttpServletRequest httpServletRequest){
        return (String)httpServletRequest.getAttribute("javax.servlet.error.request_uri");
    }

    public String getErrorMessage(HttpServletRequest httpServletRequest){
        return (String)httpServletRequest.getAttribute("javax.servlet.error.message");
    }

}
