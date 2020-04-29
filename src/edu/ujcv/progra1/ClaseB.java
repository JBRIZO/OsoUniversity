package edu.ujcv.progra1;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ClaseB {
    private ArrayDeque<alumnos> alumnosEnCola = new ArrayDeque<alumnos>();
    private ArrayList<alumnos> alumnosEnClase = new ArrayList<alumnos>();

    public ClaseB(){}

    public ArrayDeque<alumnos> getAlumnosEnCola() {
        return alumnosEnCola;
    }
    public void setAlumnosEnCola(ArrayDeque<alumnos> alumnosEnCola) {
        this.alumnosEnCola = alumnosEnCola;
    }

    public ArrayList<alumnos> getAlumnosEnClase() {
        return alumnosEnClase;
    }
    public void setAlumnosEnClase(ArrayList<alumnos> alumnosEnClase) {
        this.alumnosEnClase = alumnosEnClase;
    }
    public void agregarCola(alumnos a ){
        alumnosEnCola.add(a);
    }
    //METODOS
    public void remover(int indice){
        alumnosEnClase.remove(indice);
    }
    public int tamaño(){
        return alumnosEnClase.size();
    }

    public void  agregar(alumnos a){
        if (alumnosEnClase.size() > 9 ){
            alumnosEnCola.add(a);
        } else{
            alumnosEnClase.add(a);
        }
    }
    public alumnos getAlumnos(int indice){
        return alumnosEnClase.get(indice);
    }
}
