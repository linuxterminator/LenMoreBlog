package com.huqingshan.LenMore.repository.dao;

import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.repository.dao.base.BaseRepository;

public interface ArticleRepository extends BaseRepository<Article> {

    Article findByTitle(String Title);

}