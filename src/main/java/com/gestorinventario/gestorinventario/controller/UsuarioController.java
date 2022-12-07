package com.gestorinventario.gestorinventario.controller;

import com.gestorinventario.gestorinventario.dao.UsuarioDao;
import com.gestorinventario.gestorinventario.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value ="getUsuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }
}
