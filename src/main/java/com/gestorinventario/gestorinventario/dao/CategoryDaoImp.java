package com.gestorinventario.gestorinventario.dao;

import com.gestorinventario.gestorinventario.models.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryDaoImp implements CategoryDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Category> getCategories() {
        String query = "select * from categoria";
        return entityManager.createNativeQuery(query).getResultList();

    }
}
