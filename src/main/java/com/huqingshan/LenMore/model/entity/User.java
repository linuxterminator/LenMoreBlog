package com.huqingshan.LenMore.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(description = "用户实体")
public class User {

	@NotNull(message = "用户名不能为空")
	private String username;
	@NotNull(message = "密码不能为空")
	private String password;
	@NotNull(message = "邮箱不能为空")
	private String email;

}
