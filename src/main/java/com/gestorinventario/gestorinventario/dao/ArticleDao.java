package com.gestorinventario.gestorinventario.dao;

import com.gestorinventario.gestorinventario.models.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> getArticles();
}
