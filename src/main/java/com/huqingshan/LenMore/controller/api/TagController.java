package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.dto.TagDto;
import com.huqingshan.LenMore.model.entity.Tag;
import com.huqingshan.LenMore.service.TagService;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
@Slf4j
public class TagController {

    private final TagService tagservice;

    public TagController(TagService tagService){
        this.tagservice = tagService;
    }

    @GetMapping("")
    @ApiOperation("查找所有")
    public List<TagDto> FinadTags(){
        log.info("查找所有标签");
        return BeanUtils.mapAsList(tagservice.FindAll(),TagDto.class);
    }

    @GetMapping("/{id}")
    @ApiOperation("主键查找")
    public TagDto FindTagById(@PathVariable("id") int id){
        log.info("标签主键查找");
        return BeanUtils.map(tagservice.FindByPrimaryKey(id),TagDto.class);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("主键删除")
    public int DeleteByPrimaryKey(@PathVariable("id") int id){
        log.info("标签主键删除");
        return tagservice.DeleteByPrimaryKey(id);
    }

    @PostMapping("添加")
    public int add(@RequestBody TagDto tag){
        log.info("标签添加");
        return tagservice.add(BeanUtils.map(tag,Tag.class));
    }

}
