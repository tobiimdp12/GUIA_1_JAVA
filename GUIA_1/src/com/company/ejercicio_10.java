package com.company;

public class ejercicio_10 {
    /*
    * Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
centígrados.
    * */
    float Fahrenheit=212;
    float Centigrados;

    public void convertirFtoC()
    {
        this.Centigrados=(this.Fahrenheit-32)/1.8f;
        System.out.println(this.Centigrados);
    }
}
