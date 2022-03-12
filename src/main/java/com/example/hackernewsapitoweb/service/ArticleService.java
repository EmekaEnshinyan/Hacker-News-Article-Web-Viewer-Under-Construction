package com.example.hackernewsapitoweb.service;
import com.example.hackernewsapitoweb.dataaccessobject.ArticleDao;
import com.example.hackernewsapitoweb.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;
import java.util.UUID;

public class ArticleService {
   /* private final ArticleDao articleDao;
    //private final HackerNewClient hackerNewsClient;
    //need constructor to allow above var ArticleDao to be resolved
    //6. now that @Service, we are injecting here and use @AutoWired to ?wire? into the ArticleDao interface
    @Autowired
    //7. since there can be more than one interface of ArticleDao, we need to make sure we're working with "this" one
    //and we use @Qualifier within the constructor to do it
    public ArticleService(@Qualifier("test dao") ArticleDao articleDao){
        this.articleDao = articleDao;
    }
    //here we want to create a method to insert a new article
    //9. want to make a POST request which adds a resource to server (whereas GET is for retrieving data from server)
    @PostMapping
    public int addArticle(Article article){
        //this now allows us to generate an article id if we want to
        return articleDao.addArticle(article); // <-- recursive method
        //10. can now use the application Postman to serve as our client
        //11. when workspace made, try sending post request using localhost:8080
    }
    //MAY NEED TO CONSULT METHOD OVERLOADING
    //20. now need to connect to implemented method selectAllArticles() that is connected to interface
    public Optional<Article> selectArticleByKey(UUID key){
        return articleDao.selectArticleByKey(key);
    }

    //27. need to put same method here in service
    public Optional<Article> getArticleByKey(UUID key){
        return articleDao.selectArticleByKey(key);
    }

    //35. now place then delete handler in the controller class
    public int deleteArticle(UUID key){
        return articleDao.deleteArticleByKey(key);
    }
    //36. when updating article, we are making a new article?
    public int updateArticle(UUID key, Article article){ // <-- this almost looks like a new article is being made, but there is no logic that actually REWRITES the article
        return articleDao.updateArticleByKey(key, article);
    }*/

}