package com.Service;

/**
 * Created by cristina on 9/10/2015.
 */

import Facade.IArticleFacade;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/article")

public class ArticleService {
    @Autowired
    private IArticleFacade articleFacade;

    @RequestMapping(value="", method = RequestMethod.GET)
    @ResponseBody
    public List <Article> getAllArticles() {

        return this.articleFacade.getArticles();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Article getArticle(@PathVariable("id") int articleId) {

        return this.articleFacade.getArticle(articleId);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateArticle(@PathVariable("id") int articleId, @RequestBody Article articleUpdates){
        articleUpdates.setId(articleId);
        this.articleFacade.updateArticle(articleUpdates);
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    @ResponseBody
    public void addArticle( @RequestBody Article newArticle){
        this.articleFacade.addArticle(newArticle);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteArticle(@PathVariable("id") int articleId){
        this.articleFacade.deleteArticle(articleId);
    }

    public IArticleFacade getArticleFacade() {
        return articleFacade;
    }
    public void setArticleFacade(IArticleFacade articleFacade) {
        this.articleFacade = articleFacade;
    }
}
