package edu.ujcv.progra1;


//pojo
//plain old java object
//encapsula un objeto
public class PorHacer {
    private static int corelativo = 0;
    private int id;
    private String titulo;
    private String desc;


    public int getId(){
        return id;
    }


    public String getTitulo(){return titulo;}

    public String getDesc(){return desc;}

    public void appendDesc(String desc){
        this.desc += "\n"+ desc;
    }

    PorHacer(String titulo, String desc){
        id = corelativo++;
        this.titulo = titulo;
        this.desc = desc;
    }

    public String mostrar() {
        return titulo + " desc: \n"+desc;
    }

    public String mostrarResumido(){
        return titulo;

    }

    public String mostrarVerbose() {
        return "id: "+ id + "\n titulo: "+ mostrar();
    }
}


/// ArrayList<Alumnos>  alumnosPrimenrIngreso;  -> pasan  A y B



/// Cola<Alumnos>  claseA;  -> pasa a


/// Cola<Alumnos>  claseC; -> pasa a reuisitosD



/// Cola<Alumnos>  claseB;


/// ArrayList<Alumnos>  RequisitoClaseD;


/// Cola<Alumnos>  claseD;

