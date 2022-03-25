package com.huqingshan.LenMore.service.implement;

import com.huqingshan.LenMore.model.dto.CategoryDto;
import com.huqingshan.LenMore.model.entity.Category;
import com.huqingshan.LenMore.model.enums.SortEnum;
import com.huqingshan.LenMore.repository.dao.CategoryRepository;
import com.huqingshan.LenMore.service.CategoryService;
import com.huqingshan.LenMore.utils.CustomException.AlreadyExistsException;
import com.huqingshan.LenMore.utils.CustomException.NotFoundException;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImplement implements CategoryService{

    public final CategoryRepository categoryRepository;

    public CategoryImplement(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public int DeleteByPrimaryKey(int key) {
        return categoryRepository.deleteByPrimaryKey(key);
    }

    @Override
    public int add(Category data) {
        int count = categoryRepository.findCountByName(data.getName());
        if(count !=0){
            throw new AlreadyExistsException("该分类已经存在");
        }
        else{
            return categoryRepository.add(BeanUtils.map(data,Category.class));
        }
    }

    @Override
    public List<Category> FindAll(SortEnum sortEnum) {
        return categoryRepository.findAll();
    }

    @Override
    public Category FindByPrimaryKey(int key) {
        return categoryRepository.findByPrimaryKey(key).orElseThrow(()->new NotFoundException("没找到结果"));
    }
}
