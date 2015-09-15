package dao;

/**
 * Created by cristina on 9/11/2015.
 */
import model.Article;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface IArticleDao {
   List<Article> getAll();
   Article getArticle(int articleId);
   void addArticle(Article article);
   void deleteArticle(int artcileId);
   void updateArticle(Article article);
}
