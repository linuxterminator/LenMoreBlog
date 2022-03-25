package com.huqingshan.LenMore.model.dto;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class CategoryDto {
    private int id;

    @Size(max = 10,message = "分类最大不能超过{max}")
    private String name;
}
