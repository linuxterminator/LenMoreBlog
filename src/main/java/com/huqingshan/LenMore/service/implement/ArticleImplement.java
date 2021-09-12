package com.huqingshan.LenMore.service.implement;
import com.huqingshan.LenMore.model.entity.Article;
import com.huqingshan.LenMore.mapper.ArticleMapper;
import com.huqingshan.LenMore.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleImplement implements ArticleService {
    @Autowired
    private ArticleMapper articlemapper;

    @Override
    public Optional<List<Article>> getArticles() {
//        对于数组，使用optional需要另外处理
        List<Article> articleList = articlemapper.getArticles();
        Optional<List<Article>> optionalArticleDaoList = Optional.ofNullable(articleList);
        return optionalArticleDaoList;
    }

    @Override
    public int postArticle(Article article) {
        return 0;
    }

    @Override
    public int deleteArticle(int id) {
        return 0;
    }

    @Override
    public Optional<Article> getArticleById(int id){
        return articlemapper.getArticleById(id);
    }

    @Override
    public int updateArticle(Article article) {
        return 0;
    }
}
