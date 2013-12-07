package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author charlie
 */
public class BeerExpert {
    
    public List getBrands(String tipo){
        List brands = new ArrayList();
        
        if ("pilsner".equals(tipo)) {
            brands.add("Corona");
            brands.add("Modelo Especial");
            brands.add("Estrella");
            brands.add("Bohemia");
            brands.add("Sol");
            brands.add("XX Lager");
            brands.add("Tecate");
        } else if("lager".equals(tipo)) {
            brands.add("Modelo light");
            brands.add("Tecate light");
        } else if("munich".equals(tipo)){
            brands.add("Negra Modelo");
            brands.add("Leon");
        } else {
            brands.add("Victoria");
            brands.add("Bohemia Oscura");
            brands.add("XX Ambar");
        }
        
        return brands;
    }
}
