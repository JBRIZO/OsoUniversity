package edu.ujcv.progra1;

import static edu.ujcv.progra1.NombresAleatorios.generarNombreAleatorio;
import static edu.ujcv.progra1.NombresAleatorios.generarNumCuenta;
import static edu.ujcv.progra1.NombresAleatorios.generarApellidoAleatorio;
import static edu.ujcv.progra1.NombresAleatorios.generarNombresAleatorios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        alumnos a = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        alumnos b = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        alumnos c = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        alumnos d = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        ArrayList<Boolean> notasA = new ArrayList<Boolean>();
        ArrayList<alumnos> ClaseA = new ArrayList<alumnos>();
        ArrayList<alumnos> ClaseB = new ArrayList<alumnos>();
        ArrayList<Boolean> notasB = new ArrayList<Boolean>();
        ArrayList<alumnos> ClaseC = new ArrayList<alumnos>();
        ClaseA.add(a);
        ClaseA.add(b);
        ClaseA.add(c);
        ClaseA.add(d);
        int nota = (int) (r.nextDouble() * 100);
        if (nota <= 70) {
            notasA.add(Boolean.TRUE);
        } else {
            notasA.add(Boolean.FALSE);
        }


        }
    }

