package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {

        System.out.println(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public void saludar(Persona p) {

        System.out.printf("Hola %s, Bienvenido a Java \n", p);
    }

}
