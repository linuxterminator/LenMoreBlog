package com.huqingshan.LenMore.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆controller
 */

@Api(tags = "登陆api")
@RestController
public class Login {

	@ApiOperation("登陆")
	@PostMapping("/login")
	public String login() {
		return "login";
	}

	@ApiOperation("注册")
	@PostMapping("/register")
	public String register() {
		return "register";
	}

}
