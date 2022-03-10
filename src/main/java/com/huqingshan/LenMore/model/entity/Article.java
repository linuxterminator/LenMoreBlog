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

	@NotBlank(message = "文章标题不能为空")
	private String title;

	/**
	 * 存储解析后的markdown文档
	 */
	@NotBlank(message = "内容不能为空")
	private String content;

	/**
	 * 存储解析之前的markdown文档
	 */
	private String contentMD;

	/**
	 * 文章的可查看状态
	 */
	private boolean status;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 创建时间
	 */
	private Date createTime;

	@NotBlank(message = "作者不能为空")
	private String author;
//	@NotBlank(message = "日期不能为空")
//	private LocalDate localDate;

}
