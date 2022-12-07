package com.gestorinventario.gestorinventario.controller;

import com.gestorinventario.gestorinventario.dao.CategoryDao;
import com.gestorinventario.gestorinventario.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;
    @RequestMapping(value="getCategories")
    public List<Category> getCategories(){
        return categoryDao.getCategories();
    }
}
