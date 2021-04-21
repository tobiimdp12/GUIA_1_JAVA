package com.company;
import java.util.Scanner;
public class ejercicio_9 {

    /*
    * Programa Java que lea un número entero por teclado y calcule el doble y el triple de
ese número y lo muestre por pantalla.
    * */
    private float numero;

    public float setNumero() {
        Scanner input=new Scanner(System.in);
        numero =input.nextFloat();
        return  numero;
    }

    public void dobleDelNumero(float numero) {
        numero=numero*2;
        System.out.println("doble="+numero);
    }

    public void tripleDelNumero(float numero) {
        numero=numero*3;
        System.out.println("triple="+numero);

    }


}
