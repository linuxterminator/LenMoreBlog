package com.huqingshan.LenMore.model.vo;

import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.model.entity.Category;
import com.huqingshan.LenMore.model.entity.Tag;
import lombok.Data;

import java.util.List;

/**
 * 文章对应的视图模型
 * 由entity对应的数据库中的表中的数据组合而来
 */
@Data
public class ArticleVO {

    private Article article;

    private List<Tag> tagList;

    private List<Category> categoryList;
}
