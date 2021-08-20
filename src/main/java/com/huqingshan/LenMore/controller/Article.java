package com.huqingshan.LenMore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Article{

	  @GetMapping("/articles")
		public String getArticles(){
			  return "Articles";
		}

		@GetMapping("/article")
		public String getArticle(){
			  return "article";
		}

}
