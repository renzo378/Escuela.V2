package com.escuela.Clases;

import lombok.Data;

@Data
public class Persona {


    private String nombre;
    private String Apellido;
    private String E;

    public String NombreCompleto(){
        return this.nombre + this.Apellido;
    }
}
