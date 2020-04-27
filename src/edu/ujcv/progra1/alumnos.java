package edu.ujcv.progra1;


//pojo
//plain old java object
//encapsula un objeto
public class alumnos {
    private static int corelativo = 0;
    private String id;
    private String nombre;
    private String apellido;
    private boolean evaluacionA;
    private boolean evaluacionB;
    private boolean evaluacionC;
    private boolean evaluacionD;
    private boolean evaluacionE;
    private boolean evaluacionF;
    private boolean evaluacionG;
    private int contReprobadas;
    private int contParciales;

    public int getContParciales(){
        return contParciales;
    }
    public void setContParciales(int contParciales) {
        this.contParciales = contParciales;
    }

    public int getContReprobadas() {
        return contReprobadas;
    }

    public void setContReprobadas(int contReprobadas) {
        this.contReprobadas = contReprobadas;
    }

    public boolean getEvaluacionA(){
        return evaluacionA;
    }
    public void setEvaluacionA(boolean evaluacionA) {
        this.evaluacionA = evaluacionA;
    }

    public boolean getEvaluacionB(){
        return evaluacionB;
    }
    public void setEvaluacionB(boolean evaluacionB) {
        this.evaluacionB = evaluacionB;
    }

    public boolean getEvaluacionC(){
        return evaluacionC;
    }
    public void setEvaluacionC(boolean evaluacionC) {
        this.evaluacionC = evaluacionC;
    }

    public boolean getEvaluacionD(){
        return evaluacionD;
    }
    public void setEvaluacionD(boolean evaluacionD) {
        this.evaluacionD = evaluacionD;
    }

    public boolean getEvaluacionE(){
        return evaluacionE;
    }
    public void setEvaluacionE(boolean evaluacionE) {
        this.evaluacionE = evaluacionE;
    }

    public boolean getEvaluacionF(){
        return evaluacionF;
    }
    public void setEvaluacionF(boolean evaluacionF) {
        this.evaluacionF = evaluacionF;
    }

    public boolean getEvaluacionG(){
        return evaluacionG;
    }
    public void setEvaluacionG(boolean evaluacionG) {
        this.evaluacionG = evaluacionG;
    }


    public String getId(){
        return id;
    }

    public String getNombre(){return nombre;}

    public String getApellido(){return apellido;}

// metodos

    public void parcial(){
        this.contParciales++;
    }

    public void reprobar(){
        this.contReprobadas++;
    }


    public void appendApellido(String apellido){
        this.apellido += "\n"+ apellido;
    }

    alumnos(String nombre, String apellido, String id){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String mostrar() {
        return nombre +" " + apellido;
    }

    public String mostrarResumido(){
        return nombre;

    }
    @Override
    public String toString(){
        return getNombre() + " " + getApellido() + " " + getId();
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

