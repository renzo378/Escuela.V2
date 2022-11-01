package com.escuela.Clases;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Alumno extends  com.escuela.funciones.Persona {
    private int legajo;


    @OneToMany
    private List<Materia> materias = new ArrayList<Materia>();
    @OneToMany
    private List<Profesor> profesores = new ArrayList<Profesor>();
    @ManyToOne
    private Director director;
    @OneToOne
    private Profesor padrino;
    public String ProfesorDeLaMateria(String materia,List<Profesor> profesores){
        String retorno = "";
        if(!(this.materias.contains(materia))){
            retorno = "Nadie da esa materia";


        }else if(this.materias.contains(materia)){
            for(Profesor profesor : profesores){
                for (Materia materiaaa : profesor.getMaterias()){
                    if(materiaaa.getNombre() == materia){

                        retorno= profesor.getNombre();
                    }
                }
            }
        }
        return retorno;
    }

    public boolean EsPadrino(Profesor padrino){
        if(this.padrino == padrino){
            return true;
        }else{
            return false;
        }
    }
}
