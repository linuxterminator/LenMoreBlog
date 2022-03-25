package com.huqingshan.LenMore.model.entity;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import javax.validation.constraints.NotBlank;

/**
 * 文章对应的数据库模型
 */
@Data
@ApiModel(description = "文章实体")
public class Article {

	private int id;

	private String title;

	// 存储解析后的markdown文档
	private String content;

	// 存储解析之前的markdown文档
	private String contentMD;

	private boolean status;

	private Date updateTime;

	private Date createTime;

	private String author;

}
