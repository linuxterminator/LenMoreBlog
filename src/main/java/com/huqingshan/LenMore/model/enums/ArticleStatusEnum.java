package com.huqingshan.LenMore.model.enums;

/**
 * 文章状态枚举
 */
public enum ArticleStatusEnum {

    PUBLISHED("PUBLISHED"),
    CLOSED("CLOSED");

    private String ArticleStatus;

    private ArticleStatusEnum(String ArticleStatus){
        this.ArticleStatus = ArticleStatus;
    }

    public String getArticleStatus(){
        return ArticleStatus;
    }

}
