package com.huqingshan.LenMore.model.dto;

import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String avatar;
    private String nickName;
    private String email;

    public UserDto converTo(){
        return null;
    }
}
