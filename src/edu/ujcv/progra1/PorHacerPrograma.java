package edu.ujcv.progra1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PorHacerPrograma {

    ArrayList<alumnos> ph;
    ArrayDeque<alumnos> enProcesso;
    Stack<alumnos> terminado;

    Scanner sc;

    public PorHacerPrograma(){
        sc = new Scanner(System.in);
        ph = new ArrayList<>();
        enProcesso = new ArrayDeque<>();
        terminado = new Stack<>();
    }

    public static void main (String[] args){
        PorHacerPrograma p = new PorHacerPrograma();
    }

    public void AgregarPH(){
        System.out.println("ingrese el Titulo:");
        String titulo = sc.nextLine();

        System.out.println("ingrese el Descripcion:");
        String desc = sc.nextLine();

    }

    public void empesarPH(){
        for (int i = 0; i < ph.size(); i++) {
            System.out.println("idx:"+i+": "+ ph.get(i).mostrar());
        }
        System.out.println("ingrese el indice que quiere empesar");
        int idx = sc.nextInt();

        enProcesso.add(ph.remove(idx));
    }

    public void terminarPH(){
        terminado.add( enProcesso.remove());
    }


    public void menu() {
        System.out.println("\n\npor Hacer:");
        for (int i = 0; i < ph.size(); i++) {
            System.out.println(ph.get(i).mostrarResumido());

        }

        System.out.println("\n\n en processo:");
        System.out.println(enProcesso.peek().mostrarVerbose());


        System.out.println("\n\n\n Opciones:");
        System.out.println(" 1. agregar ph:");
        System.out.println(" 2. completar ph:");
        System.out.println(" 3. ver cumplido mas reciente:");
        System.out.println(" 4. salir");


    }


}
