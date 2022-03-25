package com.huqingshan.LenMore.repository.dao;


/**
 * 用来处理文章和分类的映射关系
 */
public interface ArticleCategoryRepository{

    /**
     * 删除文章的时候，需要删除映射表中对应的映射，但是不需要删除对应的分类
     * @param id
     * @return
     */
    int deleteByArticleId(int id);

}
