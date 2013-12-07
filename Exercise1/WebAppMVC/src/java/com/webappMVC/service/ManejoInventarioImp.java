/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webappMVC.service;

import com.webappMVC.dao.InventarioDao;
import com.webappMVC.dao.InventarioDaoImp;
import com.webappMVC.dto.ItemDTO;
import java.util.List;

/**
 *
 * @author diazeg
 */
public class ManejoInventarioImp implements ManejoInventario{
    public List<ItemDTO> getInventarioTienda(int tienda){
        InventarioDao inventarioDao =new InventarioDaoImp();
      if (tienda!=0){
        return inventarioDao.getItemsByTienda(tienda);
       }
      return null;
    }
}
