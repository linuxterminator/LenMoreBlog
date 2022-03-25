package com.huqingshan.LenMore.repository.dao;

import com.huqingshan.LenMore.model.entity.User;
import com.huqingshan.LenMore.repository.dao.base.BaseRepository;

import java.util.Optional;

public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByEmail(String email);

    Optional<User> findByNickName(String nickName);

}
