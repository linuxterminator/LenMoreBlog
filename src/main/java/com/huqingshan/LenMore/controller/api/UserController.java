package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.dto.UserDto;
import com.huqingshan.LenMore.model.entity.User;
import com.huqingshan.LenMore.service.UserService;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Api(tags = "用户api")
@RestController
@RequestMapping("/users")
@Validated
public class UserController {

	private final UserService userService;

	public UserController(UserService userService){
		this.userService = userService;
	}

	@ApiOperation("获取所有用户")
	@GetMapping("")
	public List<UserDto> getUsers() {
	    return BeanUtils.mapAsList(userService.FindAll(),UserDto.class);
	}

	@ApiOperation("通过id获取用户")
	@GetMapping("/{id}")
	public UserDto getUser(@PathVariable("id") @Min(value = 0,message = "查询id最小为0") int id) {
		return BeanUtils.map(userService.FindByPrimaryKey(id),UserDto.class);
	}

	@ApiOperation("删除用户")
	@DeleteMapping("/{id}")
	public int deleteUser(@PathVariable("id") @Min(value = 0,message = "删除id最小为0") int id){
		return userService.DeleteByPrimaryKey(id);
	}

	@ApiOperation("更新用户")
	@PutMapping("")
	public String putUser(@RequestBody @Valid UserController user){
		return "更新用户";
	}

	@GetMapping("/email/{email}")
	@ApiOperation("通过邮箱获取用户")
	public UserDto getByEmail(@RequestParam("email")String email){
		return BeanUtils.map(userService.findByEmail(email),UserDto.class);
	}

	@GetMapping("/nickname/{nickname}")
	@ApiOperation("通过昵称获取用户")
	public UserDto getByNickName(@RequestParam("nickname")String nickname){
		return BeanUtils.map(userService.findByNickName(nickname),UserDto.class);
	}
}
