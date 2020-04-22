package edu.ujcv.progra1;

import java.util.Scanner;

public class LectorTeclado {

    // Patron de diseño Singleton.

    // solo puede haber uno es un objeto Highlander.
    private static LectorTeclado instance;
    private Scanner m_SC;

    public static LectorTeclado getInstance() {
        // inicializacion perezosa.
        if (instance == null) {
            instance = new LectorTeclado();
        }
        return instance;
    }

    private LectorTeclado() {
        m_SC = new Scanner(System.in);
    }


    public int obtenerEntero(int valorPorDefecto, String mensaje) {
        int retval = valorPorDefecto;

        try {
            retval = m_SC.nextInt();
        } catch (Exception e) {
            System.out.println(mensaje);
        }

        return retval;
    }

    public int obtenerEnteroValidado(String mensajeReintento) {
        int retval = 0;

        while (!m_SC.hasNextInt()) {
            m_SC.next();
            System.out.println(mensajeReintento);
        }
        retval = m_SC.nextInt();
        return retval;
    }

    public float obtenerNumerof() {
        return 0.0f;
    }

    public float obtenerNumeroValidadof() {
        return 0.0f;
    }

    public double obtenerNumero() {
        return 0.0;
    }

    public double obtenerNumeroValidado(String mensajeReintento) {
        double retval = 0;

        while (!m_SC.hasNextDouble()) {
            m_SC.next();
            System.out.println(mensajeReintento);
        }
        retval = m_SC.nextDouble();
        return retval;
    }
}