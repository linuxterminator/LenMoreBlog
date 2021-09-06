package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.service.ArticleService;
import com.huqingshan.LenMore.utils.MybatisException;
import com.huqingshan.LenMore.utils.result.SuccessResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.Set;

/**
 * 文章controller
 */

@RestController
@Validated
@Api(tags = "用户api")
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@ApiOperation("获取所有文章")
	@GetMapping("/articles")
	public SuccessResult<List<Article>> getArticles() {

		List<Article> articleList = articleService.getArticles().orElseThrow(()->new MybatisException("数据库里没有任何文章"));
		return SuccessResult.success(articleList,HttpStatus.OK,"获取数据成功");
	}

	@ApiOperation("通过id删除文章")
	@DeleteMapping("/article/{id}")
	public int deleteArticle(@PathVariable("id") @NotBlank int id) {

		return id;
	}

	@ApiOperation("通过id获取文章")
	@GetMapping("/article/{id}")
	public SuccessResult<Article> getArticle(@PathVariable("id") @NotNull(message = "获取id不能为空") int id) {

		Article article = articleService.getArticleById(id).orElseThrow(()->new MybatisException("该id无法查找到数据"));
		return SuccessResult.success(article, HttpStatus.OK,"数据获取成功");
	}

	@ApiOperation("提交文章")
	@PostMapping("/article")
	public int postArticle(@Valid @RequestBody Article article) {

		System.out.println(article);
		return 0;
	}

	@ApiOperation("修改文章")
	@PutMapping("/article")
	public void updateArticle(@RequestBody Article article){

	}
}
