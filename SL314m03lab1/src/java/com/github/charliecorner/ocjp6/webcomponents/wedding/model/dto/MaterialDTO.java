/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.charliecorner.ocjp6.webcomponents.wedding.model.dto;

/**
 *
 * @author charlie
 */
public class MaterialDTO {
    
    private int year;
    private String name;

    public MaterialDTO() {
    }

    public MaterialDTO(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
