package com.huqingshan.LenMore.service;

import com.huqingshan.LenMore.model.entity.User;
import com.huqingshan.LenMore.service.base.CrudService;

import java.util.List;

public interface UserService extends CrudService<User>{

    User findByEmail(String email);

    User findByNickName(String nickName);
}
