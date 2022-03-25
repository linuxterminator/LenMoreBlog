package com.huqingshan.LenMore.model.dto;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class TagDto {
    private int id;

    @Size(max = 10,message = "标签名最大不能超过{max}")
    private String name;
}
