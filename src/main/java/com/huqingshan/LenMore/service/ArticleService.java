package com.huqingshan.LenMore.service;

import com.huqingshan.LenMore.model.entity.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    Optional<List<Article>> getArticles();

    int postArticle(Article article);

    int deleteArticle(int id);

    Optional<Article> getArticleById(int id);
}
