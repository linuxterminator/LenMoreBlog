package com.huqingshan.LenMore.controller.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @PostMapping("/login")
    @ApiOperation("用户登陆")
    public void login(){

    }

    @PostMapping("/logout")
    @ApiOperation("用户登出")
    public void logout(){

    }

}
