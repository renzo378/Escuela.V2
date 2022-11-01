package com.escuela.funciones;

import com.escuela.Clases.Materia;

public class Complejidad {

    public Complejidad(int id) {
        this.id = id;
    }

    public Complejidad(){

    }
    private int id;

    private void setComplejidad(Materia materia){
        if(materia.getDuracion()>300 || materia.getCorrelativas() > 4){
            materia.setComplejidad("alta");
        }else if(materia.getDuracion()>150 || materia.getCorrelativas() > 2){
            materia.setComplejidad("media");
        }else{
            materia.setComplejidad("baja");
        }
    }
}
