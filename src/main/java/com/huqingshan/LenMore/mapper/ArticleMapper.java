package com.huqingshan.LenMore.mapper;

import com.huqingshan.LenMore.model.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {
    List<Article> getArticles();

    Optional<Article> getArticleById(int id);

    Article addArticle(Article article);

    Article deleteArticle(int id);
}