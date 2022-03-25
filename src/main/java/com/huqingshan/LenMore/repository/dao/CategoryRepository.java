package com.huqingshan.LenMore.repository.dao;

import com.huqingshan.LenMore.model.entity.Category;
import com.huqingshan.LenMore.repository.dao.base.BaseRepository;

import java.util.Optional;

public interface CategoryRepository extends BaseRepository<Category> {

    Optional<Category> findByName(String CategoryName);

    int findCountByName(String name);

}
