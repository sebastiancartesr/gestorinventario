package com.gestorinventario.gestorinventario.dao;

import com.gestorinventario.gestorinventario.models.Article;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ArticleDaoImp implements ArticleDao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Article> getArticles() {
        String query = "select * from articulo";
        return entityManager.createNativeQuery(query).getResultList();
    }
}
