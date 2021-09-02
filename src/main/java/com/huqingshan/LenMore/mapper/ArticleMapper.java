package com.huqingshan.LenMore.mapper;

import com.huqingshan.LenMore.dao.ArticleDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {
    List<ArticleDao> getArticles();

    Optional<ArticleDao> getArticleById();

    ArticleDao addArticle(ArticleDao articleDao);

    ArticleDao deleteArticle(int id);
}