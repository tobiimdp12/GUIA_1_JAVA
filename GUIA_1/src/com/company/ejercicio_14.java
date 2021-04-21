package com.company;

public class ejercicio_14
{
    /*
    *Programa que calcula el volumen de una esfera
    * */

    int radio=20;
    float volumen;


    public float calcularVolumen()
    {
        this.volumen=1.3f*3.14f*(float)Math.pow(this.radio,3);
        return this.volumen;
    }
}
