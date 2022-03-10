package com.huqingshan.LenMore.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleDto {

    private int id;

    private String title;

    private String content;

    private String contentMD;

    private boolean status;

    private Date updateTime;

    private Date createTime;

    private String author;

}
