/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.charliecorner.ocjp6.webcomponents.wedding.model.service;

import com.github.charliecorner.ocjp6.webcomponents.wedding.model.dto.MaterialDTO;
import java.util.List;

/**
 *
 * @author charlie
 */
public interface QueryService {
    public List<MaterialDTO> getListaMateriales(int year);
}
