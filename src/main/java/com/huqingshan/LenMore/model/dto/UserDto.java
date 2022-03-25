package com.huqingshan.LenMore.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    private String id;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "用户头像不能为空")
    private String avatar;

    @NotBlank(message = "用户昵称不能为空")
    private String nickName;

    @NotBlank(message = "用户邮箱不能为空")
    private String email;

}
