package com.gestorinventario.gestorinventario.controller;

import com.gestorinventario.gestorinventario.dao.ArticleDao;
import com.gestorinventario.gestorinventario.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(value="getArticles")
    public List<Article> getArticles(){
        return articleDao.getArticles();
    }
}
