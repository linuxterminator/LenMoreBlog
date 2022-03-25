package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.model.enums.ArticleStatusEnum;
import com.huqingshan.LenMore.model.vo.ArticleVO;
import com.huqingshan.LenMore.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/articles")
@Validated
@Api(tags = "用户api")
@Slf4j
public class ArticleController {

	private final ArticleService articleService;

	public ArticleController(ArticleService articleService){
		this.articleService = articleService;
	}

	@ApiOperation("获取所有文章")
	@GetMapping(value="/")
	public List<ArticleVO> getArticles() {
		return null;
	}

	@ApiOperation("批量删除")
	@DeleteMapping(value="/")
    public void deleteArticles(@RequestBody List<Integer> ids){
	}

	@ApiOperation("通过id获取文章")
	@GetMapping(value="/{id}")
	public ArticleVO getArticle(@Min(value = 0,message = "查询id最小为0")@PathVariable("id") int id) {
		return null;
	}

	@ApiOperation("提交文章")
	@PostMapping(value="/")
	public Object postArticle(
			@RequestBody @Valid Article article)
	{
		return null;
	}

	@ApiOperation("修改文章")
	@PutMapping(value="/")
	public Object updateArticle(@RequestBody Article article){
		return null;
	}
}