package com.huqingshan.LenMore.repository.dao;

import com.huqingshan.LenMore.model.entity.Tag;
import com.huqingshan.LenMore.repository.dao.base.BaseRepository;

import java.util.Optional;

public interface TagRepository extends BaseRepository<Tag> {

    Optional<Tag> findByName(String tagName);

    int findCountByName(String name);
}
