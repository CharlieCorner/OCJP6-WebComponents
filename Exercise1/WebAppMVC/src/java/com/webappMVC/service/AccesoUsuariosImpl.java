/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webappMVC.service;

import com.webappMVC.dao.UsuariosDAO;
import com.webappMVC.dao.UsuariosDAOImpl;
import com.webappMVC.dto.UsuarioDTO;
import java.util.List;

/**
 *
 * @author charlie
 */
public class AccesoUsuariosImpl implements AccesoUsuarios {

    @Override
    public List<UsuarioDTO> getListaUsuarios() {
        UsuariosDAO d = new UsuariosDAOImpl();
        return d.getUsuarios();
    }
    
}
