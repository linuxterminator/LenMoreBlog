package com.huqingshan.LenMore.utils.result;

import lombok.Data;

@Data
public class ErrorInfo {

   private String domain;
   private String reason;
   private String message;

   public ErrorInfo(String domain,String reason,String message){
      this.domain = domain;
      this.reason = reason;
      this.message = message;
   }

}
