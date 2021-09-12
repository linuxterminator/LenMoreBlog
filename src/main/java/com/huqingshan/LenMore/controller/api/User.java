package com.huqingshan.LenMore.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

/**
 * 用户controller
 */

@Api(tags = "用户api")
@RestController
@Validated
public class User {

	@ApiOperation("获取所有用户")
	@GetMapping("/users")
	public String getUsers() {
		return "users";
	}

	@ApiOperation("通过id获取用户")
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable("id") @Min(value = 0,message = "查询id最小为0") int id) {
		return "user";
	}

	@ApiOperation("删除用户")
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable("id") @Min(value = 0,message = "删除id最小为0") int id){
		return null;
	}

	@ApiOperation("更新用户")
	@PutMapping("/user")
	public String putUser(@RequestBody @Valid User user){
		return null;
	}
}
