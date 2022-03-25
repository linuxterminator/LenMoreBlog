package com.huqingshan.LenMore.service.implement;

import com.huqingshan.LenMore.model.dto.TagDto;
import com.huqingshan.LenMore.model.entity.Tag;
import com.huqingshan.LenMore.model.enums.SortEnum;
import com.huqingshan.LenMore.repository.dao.TagRepository;
import com.huqingshan.LenMore.service.TagService;
import com.huqingshan.LenMore.utils.CustomException.AlreadyExistsException;
import com.huqingshan.LenMore.utils.CustomException.NotFoundException;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImplement implements TagService {

    public final TagRepository tagRepository;

    public TagServiceImplement(TagRepository tagRepository){
       this.tagRepository = tagRepository;
    }

    @Override
    public int DeleteByPrimaryKey(int key) {
        return tagRepository.deleteByPrimaryKey(key);
    }

    @Override
    public int add(Tag data) {
        int count = tagRepository.findCountByName(data.getName());
        if(count != 0){
            throw new AlreadyExistsException("标签已经存在");
        }
        else{
            return tagRepository.add(BeanUtils.map(data,Tag.class));
        }
    }

    @Override
    public List<Tag> FindAll(SortEnum sortEnum) {
        return tagRepository.findAll();
    }

    @Override
    public Tag FindByPrimaryKey(int key) {
        return tagRepository.findByPrimaryKey(key).orElseThrow(()->new NotFoundException("没找到结果"));
    }
}
