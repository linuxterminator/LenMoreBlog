package com.huqingshan.LenMore.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "用户实体")
public class User {

	private String username;
	private String password;
	private String email;

}
