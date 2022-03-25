package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.dto.TagDto;
import com.huqingshan.LenMore.model.entity.Tag;
import com.huqingshan.LenMore.model.enums.SortEnum;
import com.huqingshan.LenMore.service.TagService;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @GetMapping(value="")
    @ApiOperation("查找所有")
    public List<TagDto> FinadTags(
            @ApiParam("排序参数")
            @RequestParam(value = "sort",defaultValue = "DESC") SortEnum sort)
    {
        log.info("查找所有标签");
        log.info("枚举常量为："+sort);
        return BeanUtils.mapAsList(tagservice.FindAll(sort),TagDto.class);
    }

    @GetMapping(value="",params = {"id"})
    @ApiOperation("主键查找")
    public TagDto FindTagById(
            @ApiParam("标签ID")
            @RequestParam("id") int id)
    {
        log.info("标签主键查找"+id);
        return BeanUtils.map(tagservice.FindByPrimaryKey(id),TagDto.class);
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation("主键删除")
    public int DeleteByPrimaryKey(
            @ApiParam("标签ID")
            @PathVariable("id") int id)
    {
        log.info("标签主键删除");
        return tagservice.DeleteByPrimaryKey(id);
    }

    @PostMapping(value="")
    @ApiOperation("添加")
    public int add(
            @ApiParam("标签实体")
            @RequestBody TagDto tag)
    {
        log.info("标签添加");
        return tagservice.add(BeanUtils.map(tag,Tag.class));
    }

}
