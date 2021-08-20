package com.huqingshan.LenMore.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login{
	
	  @PostMapping("/login")
		public String login(){
			  return "login";
		}

		@PostMapping("/register")
		public String register(){
			  return "register";
		}

}
