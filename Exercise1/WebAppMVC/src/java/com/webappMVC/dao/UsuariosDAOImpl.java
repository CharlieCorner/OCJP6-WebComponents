/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webappMVC.dao;

import com.webappMVC.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author charlie
 */
public class UsuariosDAOImpl implements UsuariosDAO {

    @Override
    public List<UsuarioDTO> getUsuarios() {
        List<UsuarioDTO> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioDTO("Carlos", "Hernandez", "Rincon", (byte) 123));
        usuarios.add(new UsuarioDTO("Ray", "Avila", "Bailon", (byte) 29));
        usuarios.add(new UsuarioDTO("Peter", "Parker", "", (byte) 19));
        return usuarios;
    }
    
}
