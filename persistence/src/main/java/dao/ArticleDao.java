package dao;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by cristina on 9/11/2015.
 */
public class ArticleDao implements IArticleDao{

    private EntityManager entityManager;

    @PersistenceContext
    private void setEntityManager (EntityManager entityManager){

        this.entityManager=entityManager;
    }
    public List<Article> getAll(){
        return this.entityManager.createQuery("from Article").getResultList();
    }
    public Article getArticle(int articleId){
        return this.entityManager.find(Article.class, articleId );
    }

    @Transactional
    public void addArticle(Article article){
        this.entityManager.persist(article);
    }

    @Transactional
    public void deleteArticle(int artcileId){
        Article newArticle=getArticle(artcileId);
        if(newArticle!=null)
         this.entityManager.remove(newArticle);
    }

    @Transactional
    public void updateArticle(Article article){
        Article newArticle=this.getArticle(article.getId());
        if(newArticle!=null){
            newArticle.setName(article.getName());
            newArticle.setContent(article.getContent());
            newArticle.setDescription(article.getDescription());
            this.entityManager.persist(newArticle);
        }
    }
}
