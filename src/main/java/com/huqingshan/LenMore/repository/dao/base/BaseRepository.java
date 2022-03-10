package com.huqingshan.LenMore.repository.dao.base;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<D> {

   List<D> findAll();

   int add(D data);

   int update(D data);

   Optional<D> findByPrimaryKey(int key);

   int deleteByPrimaryKey(int id);

}
