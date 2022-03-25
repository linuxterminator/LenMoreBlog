package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.dto.CategoryDto;
import com.huqingshan.LenMore.model.entity.Category;
import com.huqingshan.LenMore.service.CategoryService;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    public final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping(value="")
    @ApiOperation("添加")
    public int add(
            @ApiParam("分类实体")
            @RequestBody CategoryDto categoryDto)
    {

        return categoryService.add(BeanUtils.map(categoryDto, Category.class));
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation("主键删除")
    public int deleteByPrimaryKey(
            @ApiParam("分类ID")
            @RequestParam("id") int id)
    {
        return categoryService.DeleteByPrimaryKey(id);
    }

    @GetMapping(value="/{id}")
    @ApiOperation("主键查找")
    public CategoryDto findByPrimaryKey(
            @ApiParam("分类ID")
            @PathVariable("id") int id)
    {
        return BeanUtils.map(categoryService.FindByPrimaryKey(id),CategoryDto.class);
    }

    @GetMapping(value="")
    @ApiOperation("查找所有")
    public List<CategoryDto> findAll(
            @ApiParam("排序参数")
            @RequestParam(value = "sort",defaultValue = "DESC") String sort)
    {
        return BeanUtils.mapAsList(categoryService.FindAll(),CategoryDto.class);
    }

}
