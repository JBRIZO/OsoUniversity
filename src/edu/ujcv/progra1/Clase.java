package edu.ujcv.progra1;

import java.util.ArrayList;

public class Clase {
    //miembros
    private ArrayList<alumnos> alumnosClase;
    private alumnos alumno;
    private Boolean nota;

    //Constructores
    public Clase(){}

    public Clase(ArrayList<alumnos> alumnosClase, int indice){
        this.alumnosClase = alumnosClase;
    }

    public Clase(alumnos alumno, Boolean nota)
    {
        this.alumno = alumno;
        this.nota = nota;
    }

// sets y gets
    public ArrayList<alumnos> getAlumnosClase(){
        return alumnosClase;
    }

    public void setAlumnosClase(ArrayList<alumnos> alumnosClase) {
        this.alumnosClase = alumnosClase;
    }

    public alumnos getAlumno()
    {
        return alumno;
    }
    public void setAlumno(alumnos alumno) {
        this.alumno = alumno;
    }
    public Boolean getNota() {
        return nota;
    }
    public void setNota(Boolean nota) {
        this.nota = nota;
    }

    public void agregar(alumnos a)
    {
        this.alumnosClase.add(a);

    }
    public alumnos mostrarAlumno(int indice){
        return this.alumnosClase.get(indice);
    }
}
