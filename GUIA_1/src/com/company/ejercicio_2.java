package com.company;

public class ejercicio_2 {

    /*
    * Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
por pantalla una serie de operaciones entre ellas.

    * */
    /*para que funcione la opcion de crear getter and setter tienen que estar las var en private*/
    public int X=2;
    public double Y=2;
    public double N=10;
    public double M=22;


    public void sumarN_M_X_Y()
    {
        double suma=this.N+this.M+this.X+this.Y;
        System.out.println("SUMA="+suma);
    }

    public void restarN_M_X_Y()
    {
        double restar=this.N+this.M+this.X+this.Y;
        System.out.println("RESTA="+restar);

    }

    public void dividirMyX()
    {
        double dividir=this.M/this.X;
        System.out.println("DIVIDIR="+dividir);
    }

    public void multiplicarNyY()
    {
        double multiplicar=this.N*this.Y;
        System.out.println("MULTIPLICAR="+multiplicar);

    }


}
