package edu.ujcv.progra1;

import java.util.Random;

public class NombresAleatorios
{

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
}

