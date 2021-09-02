package com.huqingshan.LenMore.service;

import com.huqingshan.LenMore.dao.ArticleDao;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<ArticleDao> getArticles();

    int postArticle(ArticleDao article);

    int deleteArticle(int id);

    Optional<ArticleDao> getArticleById();
}
