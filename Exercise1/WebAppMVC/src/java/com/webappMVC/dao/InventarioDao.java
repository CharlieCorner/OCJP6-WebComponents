/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webappMVC.dao;

import com.webappMVC.dto.ItemDTO;
import java.util.List;

/**
 *
 * @author diazeg
 */
public interface InventarioDao {
    public List<ItemDTO> getItemsByTienda(int tienda);
}
