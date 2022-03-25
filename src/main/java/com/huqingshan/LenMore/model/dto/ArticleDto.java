package com.huqingshan.LenMore.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class ArticleDto {

    private int id;

    @NotBlank(message = "文章标题不能为空")
    private String title;

    @NotBlank(message = "文章内容不能为空")
    private String content;

    private String contentMD;

    @NotBlank(message = "文章状态不能为空")
    private boolean status;

    private Date updateTime;

    private Date createTime;

    @NotBlank(message = "文章作者不能为空")
    private String author;

}
