/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webappMVC.dao;

import com.webappMVC.dto.ItemDTO;
import java.util.ArrayList;
import java.util.List;
import com.webappMVC.dto.ItemDTO;
/**
 *
 * @author diazeg
 */
public class InventarioDaoImp implements InventarioDao {
    public List<ItemDTO> getItemsByTienda(int tienda){
         List<ItemDTO> listItems=null;
        if (tienda==1){
          listItems = new ArrayList<ItemDTO>();
         listItems.add(new ItemDTO(1,"tenis nike",1300));
         listItems.add(new ItemDTO(2,"tenis puma",1000));
         listItems.add(new ItemDTO(3,"tenis rebook",1200));
         listItems.add(new ItemDTO(4,"tenis patito",100));
        }else if (tienda==2)  {
         listItems = new ArrayList<ItemDTO>();
         listItems.add(new ItemDTO(1,"tenis nike",1300));
         listItems.add(new ItemDTO(2,"tenis rebook",1200));
         listItems.add(new ItemDTO(4,"tenis patito",100));      
        }
        return listItems; 
    }
}
