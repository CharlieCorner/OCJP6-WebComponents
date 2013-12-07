/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.charliecorner.ocjp6.webcomponents.wedding.model.service;

import com.github.charliecorner.ocjp6.webcomponents.wedding.model.dao.QueryDAO;
import com.github.charliecorner.ocjp6.webcomponents.wedding.model.dao.QueryDAOImpl;
import com.github.charliecorner.ocjp6.webcomponents.wedding.model.dto.MaterialDTO;
import java.util.List;

/**
 *
 * @author charlie
 */
public class QueryServiceImpl implements QueryService {

    @Override
    public List<MaterialDTO> getListaMateriales(int year) {
        QueryDAO dao = new QueryDAOImpl();
        return dao.getListaMateriales(year);
    }
    
}
