package com.huqingshan.LenMore.controller.api;

import com.huqingshan.LenMore.model.dto.CategoryDto;
import com.huqingshan.LenMore.model.entity.Category;
import com.huqingshan.LenMore.service.CategoryService;
import com.huqingshan.LenMore.utils.core.BeanUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    public final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping("")
    @ApiOperation("添加")
    public int add(@RequestBody CategoryDto categoryDto){

        return categoryService.add(BeanUtils.map(categoryDto, Category.class));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("主键删除")
    public int deleteByPrimaryKey(@RequestParam("id") int id){
        return categoryService.DeleteByPrimaryKey(id);
    }

    @GetMapping("/{id}")
    @ApiOperation("主键查找")
    public CategoryDto findByPrimaryKey(@RequestParam("id") int id){
        return BeanUtils.map(categoryService.FindByPrimaryKey(id),CategoryDto.class);
    }

    @GetMapping("")
    @ApiOperation("查找所有")
    public List<CategoryDto> findAll(){
        return BeanUtils.mapAsList(categoryService.FindAll(),CategoryDto.class);
    }

}
