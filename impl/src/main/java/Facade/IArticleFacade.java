package Facade;

import model.Article;

import java.util.List;

/**
 * Created by cristina on 9/11/2015.
 */
public interface IArticleFacade {
    List<Article> getArticles();
    Article getArticle(int articleId);
    void addArticle(Article article);
    void deleteArticle(int artcileId);
    void updateArticle(Article article);

}
