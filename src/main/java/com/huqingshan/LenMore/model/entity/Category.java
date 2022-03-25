package com.huqingshan.LenMore.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * 文章分类对应的数据库模型
 */
@Data
@ApiModel("文章分类模型")
public class Category {

    private int id;

    private String name;
}
