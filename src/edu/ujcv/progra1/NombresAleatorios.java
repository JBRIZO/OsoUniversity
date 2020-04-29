package edu.ujcv.progra1;

import java.util.Random;

public class NombresAleatorios
{
    private int año;
    public static String generarNombresAleatorios()
    {
        Random r = new Random();
        String nombreAleatorio;


        String[] nombres = { "Andrea", "David", "Cesar", "Marcelo", "Stephen", "Jonathan", "Mauricio", "Francisco",
                "Daniela", "Adriana", "Camila"};
        String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
                "Carion", "Castiyo", "Castro"};

        //Genera nombres y numeros de cuenta aleatorios de una sola vez.
        nombreAleatorio = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
                + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))] + " " + (r.nextInt(10)+2010) + (r.nextInt(3)+10) + "0" + (r.nextInt(1000));

        return nombreAleatorio;
    }

    public static String generarNombreAleatorio()
    {
        Random r = new Random();
        String nombreAleatorio;


        String[] nombres = { "Andrea", "David", "Cesar", "Marcelo", "Stephen", "Jonathan", "Mauricio", "Francisco",
                "Daniela", "Adriana", "Camila"};



        nombreAleatorio = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];

        return nombreAleatorio;
    }
    public  static String generarApellidoAleatorio()
    {
     Random r = new Random();
     String apellidoAleatorio;

        String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Villalobos", "Cardona", "Cardoso", "Rodriguez", "Aguilera",
                "Banegas", "Castillo", "Castro"};

        apellidoAleatorio = apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
         return apellidoAleatorio;
    }
    public static String generarNumCuenta()
    {
        Random r = new Random();
        int año = (r.nextInt(10)+2010);
        int periodo = (r.nextInt(3)+10);
        int num = (r.nextInt(1000));
        return (r.nextInt(10)+2010) +  "" + (r.nextInt(3)+10) + "0" + (r.nextInt(1000));
    }
}

