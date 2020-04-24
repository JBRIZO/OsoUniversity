package edu.ujcv.progra1;


//pojo
//plain old java object
//encapsula un objeto
public class alumnos {
    private static int corelativo = 0;
    private int id;
    private String nombre;
    private String apellido;


    public int getId(){
        return id;
    }

    public String getNombre(){return nombre;}

    public String getApellido(){return apellido;}


    public void appendApellido(String apellido){
        this.apellido += "\n"+ apellido;
    }

    alumnos(String nombre, String apellido){
        id = corelativo++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String mostrar() {
        return nombre +" " + apellido;
    }

    public String mostrarResumido(){
        return nombre;

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

