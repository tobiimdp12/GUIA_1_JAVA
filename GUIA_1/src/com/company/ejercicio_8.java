package com.company;

import java.util.Scanner;
public class ejercicio_8 {

    /*
    *Programa Java que lea un nombre y muestre por pantalla:
“Buenos días, {NOMBRE}”.
    * */
    String nombre;


    public String obtenerNombre()
    {
        Scanner entradaEscaner = new Scanner (System.in);
        nombre=entradaEscaner.nextLine();

        return nombre;
    }

    public void saludar()
    {
        System.out.println("Buenos dias,"+this.nombre);

    }
}
