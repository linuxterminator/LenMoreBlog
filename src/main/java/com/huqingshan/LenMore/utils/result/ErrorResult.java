package com.huqingshan.LenMore.utils.result;

import com.huqingshan.LenMore.utils.result.ErrorInfo;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * 错误result对象
 * google风格
 */

@Data
public class ErrorResult {
    private HttpStatus code;
    private String message;
    private List<ErrorInfo> errorInfoList;

    public ErrorResult(HttpStatus code,String message,List<ErrorInfo> errorInfoList){
        this.code = code;
        this.message = message;
        this.errorInfoList = errorInfoList;
    }
}
