package edu.ujcv.progra1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

import static edu.ujcv.progra1.NombresAleatorios.generarNombresAleatorios;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        LectorTeclado lc = new LectorTeclado();
        ArrayList<String> alumnosGenerados = new ArrayList<>();
        ArrayList<String> claseA = new ArrayList<String>();
        ArrayList<Boolean> notasA = new ArrayList<Boolean>();
        ArrayList<String> claseC = new ArrayList<String>();
        ArrayList<Boolean> notasC = new ArrayList<Boolean>();
        ArrayList<String> claseB = new ArrayList<String>();
        ArrayList<Boolean> notasB = new ArrayList<Boolean>();
        ArrayList<String> claseD = new ArrayList<String>();
        ArrayList<Boolean> notasD = new ArrayList<Boolean>();
        ArrayList<String> claseE = new ArrayList<String>();
        ArrayList<Boolean> notasE = new ArrayList<Boolean>();
        ArrayList<String> alumnosExpulsados = new ArrayList<String>();
        int matriculados = (int) (r.nextDouble() * 5 + 6);
        int x = 0;
        while (x == 0) {
            menu.menuPrincipal();
            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        for (int i = 0; i < matriculados; i++) {
                            alumnosGenerados.add(generarNombresAleatorios());
                        }
                        for (int i = 0; i < alumnosGenerados.size(); i++) {
                            claseA.add(alumnosGenerados.get(i));
                            claseC.add(alumnosGenerados.get(i));
                            System.out.println(claseA.get(i));
                        }

                        for (int i = 0; i < matriculados; i++) {
                            int nota = (int) (r.nextDouble() * 100);
                            if (nota <= 70) {
                                notasA.add(Boolean.TRUE);
                                notasC.add(Boolean.TRUE);
                            } else {
                                notasA.add(Boolean.FALSE);
                                notasC.add(Boolean.FALSE);
                            }
                        }
                        for (int i = 0; i < claseA.size(); i++) {
                            if (notasA.get(i) == true) {
                                claseB.add(claseA.get(i));
                                claseD.add(claseA.get(i));
                                notasA.remove(i);
                                claseA.remove(i);
                                i--;
                            }
                        }
                        for (int i = 0; i < claseB.size(); i++) {
                            int nota = (int) (r.nextDouble() * 100);
                            if (nota <= 70) {
                                notasB.add(Boolean.TRUE);
                            } else {
                                notasB.add(Boolean.FALSE);
                            }
                        }

                        for (int i = 0; i < claseB.size(); i++) {
                            if (notasB.get(i) == true) {
                                claseE.add(claseB.get(i));
                                notasB.remove(i);
                                claseB.remove(i);
                                i--;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Alumnos");
                        for (int i = 0; i < alumnosGenerados.size(); i++)
                        {
                            alumnosGenerados.get(i);
                        }
                    break;
                    case 3:
                        break;
                    case 4:
                        menu.evaluacionTernas();
                    break;
                    case 5:
                        x = 1;
                        break;
                    default:
                        System.out.println("Debes ingresar un numero valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();

            }
        }
    }
}
