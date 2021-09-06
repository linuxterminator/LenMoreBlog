package com.huqingshan.LenMore.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "标签实体")
public class Tag {
    private int id;
    private String tag;
}
