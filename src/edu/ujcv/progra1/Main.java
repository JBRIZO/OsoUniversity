package edu.ujcv.progra1;

import static edu.ujcv.progra1.NombresAleatorios.generarNombreAleatorio;
import static edu.ujcv.progra1.NombresAleatorios.generarNumCuenta;
import static edu.ujcv.progra1.NombresAleatorios.generarApellidoAleatorio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LectorTeclado lc = LectorTeclado.getInstance();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        ArrayList<alumnos> alumnosGenerados = new ArrayList<alumnos>();
        ArrayList<alumnos> alumnosExpulsados = new ArrayList<alumnos>();
        ArrayList<alumnos> alumnosEgresados = new ArrayList<alumnos>();
        alumnos a = new alumnos(generarNombreAleatorio(),generarApellidoAleatorio(),generarNumCuenta());
        alumnos b = new alumnos(generarNombreAleatorio(),generarApellidoAleatorio(),generarNumCuenta());
         alumnos c = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnos d = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnos E = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnos f = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnosGenerados.add(a);
        alumnosGenerados.add(b);
        alumnosGenerados.add(c);
        alumnosGenerados.add(d);
        alumnosGenerados.add(E);
        alumnosGenerados.add(f);
        ClaseA claseA = new ClaseA();
        ClaseB claseB = new ClaseB();
        ClaseC claseC = new ClaseC();
        ClaseD claseD = new ClaseD();
        ClaseE claseE = new ClaseE();
        ClaseF claseF = new ClaseF();
        claseG claseG = new claseG();
        int contPasos = 0;

        Menu M = new Menu();
        for (int i = 0; i < alumnosGenerados.size(); i++) {
            claseA.agregar(alumnosGenerados.get(i));
            claseC.agregar(alumnosGenerados.get(i));
        }
        boolean salir = false;
        while (salir == false)
        {
            M.menuPrincipal();
            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        if (contPasos == 0) {
                            contPasos++;
                            //System.out.println("CLASE A");
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                System.out.println(claseA.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseA.getAlumnos(i).setEvaluacionA(true);
                                    //System.out.println("APROBADO");
                                    claseA.getAlumnos(i).parcial();
                                } else {
                                    claseA.getAlumnos(i).setEvaluacionA(false);
                                    claseA.getAlumnos(i).reprobar();
                                    claseA.getAlumnos(i).parcial();
                                    //System.out.println("REPROBADO");
                                }
                                if (claseA.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                if (claseA.getAlumnos(i).getEvaluacionA() == true) {
                                    claseB.agregar(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                           // System.out.println("CLASE C");
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                System.out.println(claseC.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseC.getAlumnos(i).setEvaluacionC(true);
                                    claseC.getAlumnos(i).parcial();
                                   // System.out.println("APROBADDO");
                                } else {
                                    claseC.getAlumnos(i).setEvaluacionC(false);
                                    claseC.getAlumnos(i).parcial();
                                    //System.out.println("REPROBADO");
                                }
                                if (claseC.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                if (claseC.getAlumnos(i).getEvaluacionC() == true) {
                                    claseD.requisitos(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                           for (int i = 0; i < claseD.tamañoCola(); i++)
                           {
                               if (claseD.mostrarCola(i).getEvaluacionA() == true)
                               {
                                    claseD.agregar(alumnosGenerados.get(i));
                                    claseD.removerDeCola(i);
                                    i--;
                                }
                           }
                            break;
                        }
                        if (contPasos == 1) {
                            contPasos++;
                            //System.out.println("CLASE B");
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                System.out.println(claseB.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseB.getAlumnos(i).setEvaluacionB(true);
                                    //System.out.println("Aprobado");
                                    claseB.getAlumnos(i).parcial();
                                } else {
                                    claseB.getAlumnos(i).setEvaluacionB(false);
                                    //System.out.println("Reprobado");
                                    claseB.getAlumnos(i).parcial();
                                }
                            }
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                if (claseB.getAlumnos(i).getEvaluacionB() == true) {
                                    claseE.agregar(claseB.getAlumnos(i));
                                    claseB.remover(i);
                                    i--;
                                }
                            }

                            //System.out.println("CLASE D");
                            for (int i = 0; i < claseD.tamaño(); i++) {
                                System.out.println(claseD.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseD.getAlumnos(i).setEvaluacionD(true);
                                   // System.out.println("APROBADO");
                                    claseD.getAlumnos(i).parcial();
                                } else {
                                   // System.out.println("REPROBADO");
                                    claseD.getAlumnos(i).parcial();
                                    claseD.getAlumnos(i).setEvaluacionD(false);
                                }
                            }

                            for (int i = 0; i < claseD.tamaño(); i++) {
                                if (claseD.getAlumnos(i).getEvaluacionD() == true) {
                                    claseF.agregar(claseD.getAlumnos(i));
                                    claseD.remover(i);
                                    i--;
                                }
                            }
                           // System.out.println("CLASE A");
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                System.out.println(claseA.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseA.getAlumnos(i).setEvaluacionA(true);
                                   // System.out.println("APROBADO");
                                    claseA.getAlumnos(i).parcial();
                                } else {
                                    claseA.getAlumnos(i).setEvaluacionA(false);
                                    claseA.getAlumnos(i).reprobar();
                                    claseA.getAlumnos(i).parcial();
                                   // System.out.println("REPROBADO");
                                }
                                if (claseA.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                if (claseA.getAlumnos(i).getEvaluacionA() == true) {
                                    claseB.agregar(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                           // System.out.println("CLASE C");
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                System.out.println(claseC.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseC.getAlumnos(i).setEvaluacionC(true);
                                    claseC.getAlumnos(i).parcial();
                                   // System.out.println("APROBADDO");
                                } else {
                                    claseC.getAlumnos(i).setEvaluacionC(false);
                                    claseC.getAlumnos(i).parcial();
                                   // System.out.println("REPROBADO");
                                }
                                if (claseC.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                if (claseC.getAlumnos(i).getEvaluacionC() == true) {
                                    claseD.requisitos(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseD.tamañoCola(); i++)
                            {
                                if (claseD.mostrarCola(i).getEvaluacionA() == true)
                                {
                                    claseD.agregar(alumnosGenerados.get(i));
                                    claseD.removerDeCola(i);
                                    i--;
                                }
                            }

                            break;
                        }
                        if (contPasos == 2)
                        {
                            contPasos++;
                            //System.out.println("CLASE E");
                            for (int i = 0; i < claseE.tamaño(); i++) {
                                System.out.println(claseE.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseE.getAlumnos(i).setEvaluacionE(true);
                                   // System.out.println("APROBADO");
                                    claseE.getAlumnos(i).parcial();
                                } else {
                                   // System.out.println("REPROBADO");
                                    claseE.getAlumnos(i).parcial();
                                    claseE.getAlumnos(i).setEvaluacionE(false);
                                }
                            }
                            for (int i = 0; i < claseE.tamaño(); i++) {
                                if (claseE.getAlumnos(i).getEvaluacionE() == true) {
                                    claseE.remover(i);
                                    i--;
                                }
                            }
                            //System.out.println("CLASE F");
                            for (int i = 0; i < claseF.tamaño(); i++) {
                                System.out.println(claseF.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseF.getAlumnos(i).setEvaluacionF(true);
                                  //  System.out.println("APROBADO");
                                    claseF.getAlumnos(i).parcial();
                                } else {
                                   // System.out.println("REPROBADO");
                                    claseF.getAlumnos(i).parcial();
                                    claseF.getAlumnos(i).setEvaluacionD(false);
                                }
                            }
                                for (int i = 0; i < claseF.tamaño(); i++) {
                                    if (claseF.getAlumnos(i).getEvaluacionF() == true) {
                                        claseF.remover(i);
                                        i--;
                                    }
                                }
                                for (int i = 0; i < alumnosGenerados.size();i++){
                                    if ((alumnosGenerados.get(i).getEvaluacionE() && alumnosGenerados.get(i).getEvaluacionF()) == true){
                                        claseG.agregar(alumnosGenerados.get(i));
                                    }
                                }
                            //System.out.println("CLASE A");
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                System.out.println(claseA.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseA.getAlumnos(i).setEvaluacionA(true);
                                   // System.out.println("APROBADO");
                                    claseA.getAlumnos(i).parcial();
                                } else {
                                    claseA.getAlumnos(i).setEvaluacionA(false);
                                    claseA.getAlumnos(i).reprobar();
                                    claseA.getAlumnos(i).parcial();
                                   // System.out.println("REPROBADO");
                                }
                                if (claseA.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                if (claseA.getAlumnos(i).getEvaluacionA() == true) {
                                    claseB.agregar(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                            //System.out.println("CLASE B");
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                System.out.println(claseB.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseB.getAlumnos(i).setEvaluacionB(true);
                                   // System.out.println("Aprobado");
                                    claseB.getAlumnos(i).parcial();
                                } else {
                                    claseB.getAlumnos(i).setEvaluacionB(false);
                                   // System.out.println("Reprobado");
                                    claseB.getAlumnos(i).parcial();
                                }
                            }
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                if (claseB.getAlumnos(i).getEvaluacionB() == true) {
                                    claseE.agregar(claseB.getAlumnos(i));
                                    claseB.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseB.tamaño(); i++)
                            {
                                if (claseB.getAlumnos(i).getEvaluacionB() == true) {
                                    claseE.agregar(claseB.getAlumnos(i));
                                    claseB.remover(i);
                                    i--;
                                }
                            }
                           // System.out.println("CLASE C");
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                System.out.println(claseC.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseC.getAlumnos(i).setEvaluacionC(true);
                                    claseC.getAlumnos(i).parcial();
                                   // System.out.println("APROBADDO");
                                } else {
                                    claseC.getAlumnos(i).setEvaluacionC(false);
                                    claseC.getAlumnos(i).parcial();
                                   // System.out.println("REPROBADO");
                                }
                                if (claseC.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                if (claseC.getAlumnos(i).getEvaluacionC() == true) {
                                    claseD.requisitos(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseD.tamañoCola(); i++)
                            {
                                if (claseD.mostrarCola(i).getEvaluacionA() == true)
                                {
                                    claseD.agregar(alumnosGenerados.get(i));
                                    claseD.removerDeCola(i);
                                    i--;
                                }
                            }
                           // System.out.println("CLASE D");
                            for (int i = 0; i < claseD.tamaño(); i++) {
                                System.out.println(claseD.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseD.getAlumnos(i).setEvaluacionD(true);
                                    //System.out.println("APROBADO");
                                    claseD.getAlumnos(i).parcial();
                                } else {
                                   // System.out.println("REPROBADO");
                                    claseD.getAlumnos(i).parcial();
                                    claseD.getAlumnos(i).reprobar();
                                    claseD.getAlumnos(i).setEvaluacionD(false);
                                }
                            }
                            for (int i = 0; i < claseD.tamaño(); i++) {
                                if (claseD.getAlumnos(i).getEvaluacionD() == true) {
                                    claseF.agregar(claseD.getAlumnos(i));
                                    claseD.remover(i);
                                    i--;
                                }
                            }
                            break;
                        }

                        if (contPasos >= 3) {
                            contPasos++;
                            //System.out.println("CLASE G");
                            for (int i = 0; i < alumnosGenerados.size(); i++) {
                                if ((alumnosGenerados.get(i).getEvaluacionE() && alumnosGenerados.get(i).getEvaluacionF()) == true) {
                                    claseG.agregar(alumnosGenerados.get(i));
                                    System.out.println(claseG.getAlumnos(i));
                                }
                            }
                           // System.out.println("CLASE A");
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                System.out.println(claseA.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseA.getAlumnos(i).setEvaluacionA(true);
                                   // System.out.println("APROBADO");
                                    claseA.getAlumnos(i).parcial();
                                } else {
                                    claseA.getAlumnos(i).setEvaluacionA(false);
                                    claseA.getAlumnos(i).reprobar();
                                    claseA.getAlumnos(i).parcial();
                                   // System.out.println("REPROBADO");
                                }
                                if (claseA.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseA.tamaño(); i++) {
                                if (claseA.getAlumnos(i).getEvaluacionA() == true) {
                                    claseB.agregar(claseA.getAlumnos(i));
                                    claseA.remover(i);
                                    i--;
                                }
                            }
                            //System.out.println("CLASE B");
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                System.out.println(claseB.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseB.getAlumnos(i).setEvaluacionB(true);
                                   // System.out.println("Aprobado");
                                    claseB.getAlumnos(i).parcial();
                                } else {
                                    claseB.getAlumnos(i).setEvaluacionB(false);
                                   // System.out.println("Reprobado");
                                    claseB.getAlumnos(i).parcial();
                                }
                            }
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                if (claseB.getAlumnos(i).getEvaluacionB() == true) {
                                    claseE.agregar(claseB.getAlumnos(i));
                                    claseB.remover(i);
                                    i--;
                                }
                            }
                           // System.out.println("CLASE C");
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                System.out.println(claseC.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseC.getAlumnos(i).setEvaluacionC(true);
                                    claseC.getAlumnos(i).parcial();
                                  //  System.out.println("APROBADDO");
                                } else {
                                    claseC.getAlumnos(i).setEvaluacionC(false);
                                    claseC.getAlumnos(i).parcial();
                                   // System.out.println("REPROBADO");
                                }
                                if (claseC.getAlumnos(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseC.tamaño(); i++) {
                                if (claseC.getAlumnos(i).getEvaluacionC() == true) {
                                    claseD.requisitos(claseC.getAlumnos(i));
                                    claseC.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseD.tamañoCola(); i++)
                            {
                                if (claseD.mostrarCola(i).getEvaluacionA() == true)
                                {
                                    claseD.agregar(alumnosGenerados.get(i));
                                    claseD.removerDeCola(i);
                                    i--;
                                }
                            }
                            //System.out.println("CLASE D");
                            for (int i = 0; i < claseD.tamaño(); i++) {
                                System.out.println(claseD.getAlumnos(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    claseD.getAlumnos(i).setEvaluacionD(true);
                                   // System.out.println("APROBADO");
                                    claseD.getAlumnos(i).parcial();
                                } else {
                                  //  System.out.println("REPROBADO");
                                    claseD.getAlumnos(i).parcial();
                                    claseD.getAlumnos(i).setEvaluacionD(false);
                                }
                            }

                            for (int i = 0; i < claseD.tamaño(); i++) {
                                if (claseD.getAlumnos(i).getEvaluacionD() == true) {
                                    claseF.agregar(claseD.getAlumnos(i));
                                    claseD.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseB.tamaño(); i++) {
                                if (claseB.getAlumnos(i).getEvaluacionB() == true) {
                                    claseE.agregar(claseB.getAlumnos(i));
                                    claseB.remover(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < claseE.tamaño();i++){
                                System.out.println(claseE.getAlumnos(i));
                                int nota = (int)(r.nextDouble()*100);
                                if (nota <= 70){
                                  //  System.out.println("APROBADO");
                                    claseE.getAlumnos(i).setEvaluacionE(true);
                                    claseE.getAlumnos(i).parcial();
                                }else{
                                    //System.out.println("REPROBADO");
                                    claseE.getAlumnos(i).setEvaluacionE(false);
                                    claseE.getAlumnos(i).parcial();
                                    claseE.getAlumnos(i).reprobar();
                                }
                            }

                        break;
                }
                        break;
                    case 2:
                        M.alumnos();
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                for (int i = 0; i < alumnosGenerados.size(); i++) {
                                    System.out.println(alumnosGenerados.get(i));
                                }
                                break;
                            case 2:
                                for (int i = 0; i < alumnosExpulsados.size(); i++) {
                                    System.out.println(alumnosExpulsados.get(i));
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                salir = true;
                                break;
                        }
                        break;
                    case 3:
                        boolean salir3 = false;
                        while (!salir3) {
                            M.consultarClase();
                            try {
                                int opcion3 = sc.nextInt();
                                switch (opcion3) {
                                    case 1:
                                        if (claseA.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseA.tamaño(); i++) {
                                                System.out.println(claseA.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 2:
                                        if (claseB.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseB.tamaño(); i++) {
                                                System.out.println(claseB.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 3:
                                        if (claseC.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseC.tamaño(); i++) {
                                                System.out.println(claseC.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 4:
                                        if (claseD.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseD.tamaño(); i++) {
                                                System.out.println(claseD.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 5:
                                        if (claseE.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseE.tamaño(); i++) {
                                                System.out.println(claseE.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 6:
                                        if (claseF.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseF.tamaño(); i++) {
                                                System.out.println(claseF.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 7:
                                        if (claseG.tamaño() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < claseG.tamaño(); i++) {
                                                System.out.println(claseG.getAlumnos(i));
                                            }
                                        }
                                        break;

                                    case 8:
                                        salir3 = true;
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero rapido");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Ingresaa un numero valido");
                            }
                        }
                        break;
                    case 4:
                        M.evaluacionTernas();
                        try {
                            int opcion4 = sc.nextInt();
                            switch (opcion4)
                            {
                                case 1:
                                    for (int i = 0; i < claseG.tamaño(); i++){
                                        System.out.println("Alumno " + i + ":");
                                        System.out.println(claseG.getAlumnos(i));
                                        System.out.println("1) Aprobar \n 2)Reprobar");
                                        int calificacion = (int) lc.obtenerEnteroValidado("Debes insertar un numero");
                                        if (calificacion == 1){
                                            claseG.getAlumnos(i).setEvaluacionG(true);
                                            claseG.getAlumnos(i).parcial();
                                        }if (calificacion == 2){
                                            claseG.getAlumnos(i).setEvaluacionG(false);
                                            claseG.getAlumnos(i).reprobar();
                                            claseG.getAlumnos(i).parcial();
                                        }else{
                                            System.out.println("Debe ser 1 o 2");
                                        }
                                    }
                                    break;
                                case 2:
                                    if (alumnosExpulsados.size() == 0) {
                                        System.out.println("NO HAY ALUMNOS EXPULSADOS");
                                    }else {
                                        for (int i = 0; i < alumnosExpulsados.size(); i++) {
                                            System.out.println(i + ": " + alumnosExpulsados.get(i));
                                        }
                                    }

                            }
                                break;
                        } catch (InputMismatchException e) {
                            System.out.println("Ingresa un numero valido");
                        }

                    case 5:
                        salir = true;
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido");
                sc.next();
            }

        }
    }
}

