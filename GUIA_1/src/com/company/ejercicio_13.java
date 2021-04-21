package com.company;

public class ejercicio_13 {

    /*
    Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
longitud de la hipotenusa según el teorema de Pitágoras.
    * */

    int cateto1=4;
    int cateto2=3;
    double hipotenusa;//como la funcion math.pow retorna un double

    public double calcularHipotenusa()
    {
        this.hipotenusa=Math.sqrt((Math.pow(this.cateto1,2)+Math.pow(this.cateto2,2)));
        return  this.hipotenusa;
    }
}
