package com.company;
import java.util.Scanner;
public class ejercicio_16 {
    /*
    * Programa que lee un número de 3 cifras y muestra sus cifras por separado.
     */


    String numero="200";

    public void separarNumero()
    {
    for(int i=0;i<this.numero.length();i++)
        System.out.println(this.numero.charAt(i)+"|");
    }

}
