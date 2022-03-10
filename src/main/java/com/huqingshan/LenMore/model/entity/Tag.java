package com.huqingshan.LenMore.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 文章标签对应的数据库模型
 */
@Data
@ApiModel(description = "标签实体")
public class Tag {

    private int id;

    private String name;
}
