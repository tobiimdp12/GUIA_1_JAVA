package com.company;

public class ejercicio_1 {

    /*
    Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
variable C

     */

    public int N=5;
    public double A=2;
    public char C='a';

    public void imprimirValores()
    {
        System.out.println("N="+this.N);
        System.out.println("A="+this.A);
        System.out.println("C="+this.C);
    }

    public void sumarNyA()
    {

        double sumaNyA=this.N+this.A;

        System.out.println("N+A="+sumaNyA);


    }
    public void restarAyN()
    {

        double restaAyN=this.A+this.N;


        System.out.println("A-N="+restaAyN);


    }
    public void mostrarACSIIdeC()
    {

        System.out.println("Valor de C en la tabla ASCII="+(int)this.C);

    }
}
