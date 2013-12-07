package com.webappMVC.dto;

/**
 *
 * @author Carlos Rincon
 */
public class UsuarioDTO {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private byte edad;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nombre, String apellidoPaterno, String apellidoMaterno, byte edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
