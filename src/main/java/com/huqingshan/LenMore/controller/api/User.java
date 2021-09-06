package com.huqingshan.LenMore.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
/**
 * 用户controller
 */

@Api(tags = "用户api")
@RestController
public class User {

	@ApiOperation("获取所有用户")
	@GetMapping("/users")
	public String getUsers() {
		return "users";
	}

	@ApiOperation("通过id获取用户")
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable("id") int id) {
		return "user";
	}

	@ApiOperation("删除用户")
	@DeleteMapping("/user")
	public String deleteUser(){
		return null;
	}

	@ApiOperation("更新用户")
	@PutMapping("/user")
	public String putUser(){
		return null;
	}
}
