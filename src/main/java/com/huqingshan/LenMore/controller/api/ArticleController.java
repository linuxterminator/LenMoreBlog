package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.service.ArticleService;
import com.huqingshan.LenMore.utils.CustomException.MybatisException;
import com.huqingshan.LenMore.utils.resultUnitl.SuccessResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import javax.validation.constraints.Min;
import java.util.List;

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
	public SuccessResult<Object> deleteArticle(@PathVariable("id") @Min(value = 0,message = "删除id最小为0") int id) {

		articleService.deleteArticle(id);
		return SuccessResult.success(null,HttpStatus.OK,"删除文章成功");
	}

	@ApiOperation("通过id获取文章")
	@GetMapping("/article/{id}")
	public SuccessResult<Article> getArticle(@PathVariable("id") @Min(value = 0,message = "查询id最小为0") int id) {

		Article article = articleService.getArticleById(id).orElseThrow(()->new MybatisException("该id无法查找到数据"));
		return SuccessResult.success(article, HttpStatus.OK,"数据获取成功");
	}

	@ApiOperation("提交文章")
	@PostMapping("/article")
	public SuccessResult<Object> postArticle(@RequestBody @Valid Article article) {

		articleService.postArticle(article);
		return SuccessResult.success(null,HttpStatus.OK,"提交文章成功");
	}

	@ApiOperation("修改文章")
	@PutMapping("/article")
	public SuccessResult<Object> updateArticle(@RequestBody Article article){

		articleService.updateArticle(article);
		return SuccessResult.success(null,HttpStatus.OK,"修改文章成功");
	}
}
