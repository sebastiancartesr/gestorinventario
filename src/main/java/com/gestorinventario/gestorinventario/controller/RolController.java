package com.gestorinventario.gestorinventario.controller;

import com.gestorinventario.gestorinventario.dao.RolDao;
import com.gestorinventario.gestorinventario.models.Rol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RolController  {
    private RolDao rolDao;
    @RequestMapping(value ="getRoles")
    public List<Rol> getRoles(){
        return rolDao.getRoles();
    }
}
