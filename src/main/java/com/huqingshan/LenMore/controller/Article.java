package com.huqingshan.LenMore.controller;

import com.huqingshan.LenMore.dao.ArticleDao;
import com.huqingshan.LenMore.service.ArticleService;
import com.huqingshan.LenMore.utils.MybatisException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Article {
	@Autowired
	private ArticleService articleService;

	@GetMapping("/articles")
	public List<ArticleDao> getArticles() {
		return articleService.getArticles();
	}

	@GetMapping("/article/{id}")
	public ArticleDao getArticle(@PathVariable("id") int id) {
		ArticleDao articleDao;
//		需要注意，orElseThrow返回的不是Optional，而是封装的对象，或者null
//		articleDao不要声明在try里面，否则生命周期只在try里面
//		try{
//		    articleDao = articleService.getArticleById()
//					.orElseThrow(()->new MybatisException("数据不存在"));
//		}
//		catch(MybatisException mybatisException){
//			System.out.println("数据不存在");
//			return null;
//		}
		articleDao = articleService.getArticleById().orElseThrow(()->new MybatisException("数据不存在"));
		return articleDao;
	}

	@DeleteMapping("/article/{id}")
	public int deleteArticle(@PathVariable("id") int id) {
		System.out.println(id);
		return 0;
	}

	@PostMapping("/article")
	public int postArticle(@RequestBody ArticleDao articleDao) {
		System.out.println(articleDao);
		return 0;
	}

	@PutMapping("/article")
	public void updateArticle(@RequestBody ArticleDao articleDao){

	}
}
