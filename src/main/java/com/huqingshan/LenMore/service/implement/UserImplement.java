package com.huqingshan.LenMore.service.implement;

import com.huqingshan.LenMore.model.entity.User;
import com.huqingshan.LenMore.repository.dao.UserRepository;
import com.huqingshan.LenMore.service.UserService;
import com.huqingshan.LenMore.utils.CustomException.NotFoundException;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplement implements UserService {

    public final UserRepository userRepository;

    public UserImplement(UserRepository userRepository){
        this. userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(()->new NotFoundException("没有对应的用户"));
    }

    @Override
    public User findByNickName(String nickName) {
        return userRepository.findByNickName(nickName).orElseThrow(()->new NotFoundException("没有对应的用户"));
    }

    @Override
    public int DeleteByPrimaryKey(int key) {
        return userRepository.deleteByPrimaryKey(key);
    }

    @Override
    public int add(User data) {
        return 0;
    }

    @Override
    public List<User> FindAll() {
        return userRepository.findAll();
    }

    @Override
    public User FindByPrimaryKey(int key) {
        return userRepository.findByPrimaryKey(key).orElseThrow(()->new NotFoundException("未找到用户"));
    }
}
