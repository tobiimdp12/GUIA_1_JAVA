package com.company;
import java.util.Scanner;

public class ejercicio_11 {
    /*
    * Programa que lee por teclado el valor del radio de una circunferencia, calcula y
muestra por pantalla la longitud y el área de la circunferencia.
    * */
    float radio;
    double area;
    double longitud;

    public float obtenerRadio()
    {
        Scanner radioInput=new Scanner(System.in);
        radio=radioInput.nextFloat();
        return radio;
    }
    public void calcularArea(float radio)
    {
        this.area=3.14* Math.pow(radio,2);
        System.out.println("el area es igual a "+this.area+"cm2");

    }

    public void calcularLongitud(float radio)
    {
        this.longitud=2*3.14*radio;
        System.out.println("la longitud es igual a "+this.longitud+"cm");
    }

}
