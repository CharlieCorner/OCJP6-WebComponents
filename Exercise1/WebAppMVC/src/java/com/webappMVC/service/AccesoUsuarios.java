/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webappMVC.service;

import com.webappMVC.dto.UsuarioDTO;
import java.util.List;

/**
 *
 * @author charlie
 */
public interface AccesoUsuarios {
    public List<UsuarioDTO> getListaUsuarios();
}
