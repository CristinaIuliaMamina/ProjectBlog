package Facade;

/**
 * Created by cristina on 9/11/2015.
 */

import dao.IArticleDao;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class ArticleFacade implements IArticleFacade{
    @Autowired
    private IArticleDao articleDao;

    public List<Article> getArticles(){

        return this.articleDao.getAll();
    }

    public IArticleDao getArticleDao() {
        return articleDao;
    }

    public Article getArticle(int articleId){
         return this.articleDao.getArticle(articleId);
    }
    public void addArticle(Article article){
        this.articleDao.addArticle(article);
    }
    public void deleteArticle(int artcileId){
         this.articleDao.deleteArticle(artcileId);
    }
    public void updateArticle(Article article){
        this.articleDao. updateArticle( article);
    }

    public void setArticleDao(IArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
