package com.escuela.funciones;
import com.escuela.Clases.*;
public class AprobarAlumno {
    private Alumno alumno;
    private Profesor profesor;
    private int examen;
    public static String Examen(Alumno alumno,Profesor profesor,int examen){
        if(examen>6){
            return "Aprobo";
        }else{
            return "Desaprobo";
        }
    }
}
