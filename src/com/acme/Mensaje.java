package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {
        System.out.println(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public void saludar(String nombre) {
        System.out.printf("Hola %s, bienvenido a Java \n", nombre);
    }
}
