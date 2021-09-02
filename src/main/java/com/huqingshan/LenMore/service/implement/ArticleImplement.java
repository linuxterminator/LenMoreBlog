package com.huqingshan.LenMore.service.implement;
import com.huqingshan.LenMore.dao.ArticleDao;
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
    public List<ArticleDao> getArticles() {
//        对于数组，使用optional需要另外处理
        List<ArticleDao> articleDaoList = articlemapper.getArticles();
        Optional<List<ArticleDao>> optionalArticleDaoList = Optional.ofNullable(articleDaoList);
        return null;
    }

    @Override
    public int postArticle(ArticleDao article) {
        return 0;
    }

    @Override
    public int deleteArticle(int id) {
        return 0;
    }

    @Override
    public Optional<ArticleDao> getArticleById(){
        return articlemapper.getArticleById();
    }
}
