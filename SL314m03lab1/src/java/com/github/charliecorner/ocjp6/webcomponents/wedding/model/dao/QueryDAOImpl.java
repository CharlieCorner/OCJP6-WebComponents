/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.charliecorner.ocjp6.webcomponents.wedding.model.dao;

import com.github.charliecorner.ocjp6.webcomponents.wedding.model.dto.MaterialDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author charlie
 */
public class QueryDAOImpl implements QueryDAO{
    
    private static final List<MaterialDTO> MATERIALES;
    
    static{
        MATERIALES = new ArrayList<>(5);
        MATERIALES.add(new MaterialDTO(1988, "Rayón"));
        MATERIALES.add(new MaterialDTO(1988, "Mostaza"));
        MATERIALES.add(new MaterialDTO(1976, "Rayón"));
        MATERIALES.add(new MaterialDTO(1958, "Rayón"));
        MATERIALES.add(new MaterialDTO(2013, "Pigs"));
    }

    @Override
    public List<MaterialDTO> getListaMateriales(int year) {
        List<MaterialDTO> materiales = new ArrayList<>(5);
        for (MaterialDTO materialDTO : MATERIALES) {
            if (year == materialDTO.getYear()) {
                materiales.add(materialDTO);
            }
        }
        return materiales;
    }
    
}
