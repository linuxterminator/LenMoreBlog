package com.huqingshan.LenMore.service.implement;
import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.model.enums.SortEnum;
import com.huqingshan.LenMore.repository.dao.*;
import com.huqingshan.LenMore.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleImplement implements ArticleService{

    private final ArticleRepository articleRepository;

    private final TagRepository tagRepository;

    private final CategoryRepository categoryRepository;

    private final ArticleTagRepository articleTagRepository;

    private final ArticleCategoryRepository articleCategoryRepository;

    public ArticleImplement(
            ArticleRepository articleRepository,
            TagRepository tagRepository,
            CategoryRepository categoryRepository,
            ArticleTagRepository articleTagRepository,
            ArticleCategoryRepository articleCategoryRepository){
        this.articleRepository = articleRepository;
        this.tagRepository = tagRepository;
        this.categoryRepository = categoryRepository;
        this.articleTagRepository = articleTagRepository;
        this.articleCategoryRepository = articleCategoryRepository;
    }

    @Override
    public int DeleteByPrimaryKey(int key) {
        return 0;
    }

    @Override
    public int add(Article data) {
        return 0;
    }

    @Override
    public List<Article> FindAll(SortEnum sortEnum) {
        return null;
    }

    @Override
    public Article FindByPrimaryKey(int key) {
        return null;
    }
}

// 通常，我们需要创建一个新的几个类ArticleVO来存放转换后的article，但是，我们可以使用collect
// 使用Collectors.toList()转换成对应类型的List,在这里是List<ArticleVO>，但是，我们也可以自己指定
//        List<ArticleVO> voList = new ArrayList<>();

//        list.forEach(item->{
//            voList.add(ConvertToVo(item));
//        });
// return voList;


// 理论上对map里面每个元素的处理应该这样写，但是，但是这里ConvertToVo是当前class的方法，所以需要使用当前对象
//        return list
//                .stream()
//                .map(ArticleImplement::ConvertToVo)
//                .collect(Collectors.toList());

// 或者map中使用lambda表达式
//        return list.stream().map(item->ConvertToVo(item)).collect(Collectors.toList());

// map中的对象是Article，但是如果我们想调用实例对象的方法我们需要先获取这个对象，但是Article没有，参考方法引用的对象方法，实例方法
