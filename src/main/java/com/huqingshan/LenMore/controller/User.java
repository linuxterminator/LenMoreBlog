package com.huqingshan.LenMore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User{

	@GetMapping("/users")
	public String getUsers(){
		return "users";
	}

	@GetMapping("/user")
	public String getUser(){
		return "user";
	}

}
