package edu.ujcv.progra1;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ClaseD {
    private ArrayList<alumnos> alumnosEnCola = new ArrayList<alumnos>();
    private ArrayList<alumnos> alumnosEnClase = new ArrayList<alumnos>();

    public ClaseD(){}

    public ArrayList<alumnos> getAlumnosEnCola() {
        return alumnosEnCola;
    }
    public void setAlumnosEnCola(ArrayList<alumnos> alumnosEnCola) {
        this.alumnosEnCola = alumnosEnCola;
    }

    public ArrayList<alumnos> getAlumnosEnClase() {
        return alumnosEnClase;
    }
    public void setAlumnosEnClase(ArrayList<alumnos> alumnosEnClase) {
        this.alumnosEnClase = alumnosEnClase;
    }
    //METODOS
    public void removerDeCola(int indice){
        alumnosEnCola.remove(indice);
    }
    public int tamañoCola(){
        return alumnosEnCola.size();
    }

    public void requisitos(alumnos a){
        alumnosEnCola.add(a);
    }
    public alumnos mostrarCola(int indice){
        return alumnosEnCola.get(indice);
    }
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
