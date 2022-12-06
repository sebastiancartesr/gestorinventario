package com.gestorinventario.gestorinventario.dao;

import com.gestorinventario.gestorinventario.models.Rol;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository
@Transactional
public class RolDaoImp implements RolDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Rol> getRoles() {
        String query = "From rol";
        return entityManager.createQuery(query).getResultList();
    }
}
