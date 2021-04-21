package com.company;
import java.util.Scanner;
public class ejercicio_12 {
    /*
    * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
    * */



    public float velocidadK_M;
    public float velocidadM_S;

    public float obtenerVelocidad() {

        Scanner velocidadInput=new Scanner(System.in);
        velocidadK_M=velocidadInput.nextFloat();
        return  velocidadK_M;

    }

    public void pasarKmAms(float velocidadK_M)
    {
        velocidadM_S=velocidadK_M*5/18;
        System.out.println("KM/h a M/s "+velocidadM_S);
    }


}
