package com.huqingshan.LenMore.model.entity;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@ApiModel(description = "文章实体")
public class Article {

	@NotBlank(message = "文章标题不能为空")
	private String title;
	@NotBlank(message = "内容不能为空")
	private String content;
	@NotBlank(message = "作者不能为空")
	private String author;
//	@NotBlank(message = "日期不能为空")
//	private LocalDate localDate;

}
