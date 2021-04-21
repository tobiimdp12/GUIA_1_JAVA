package com.company;

public class ejercicio_17 {
    /*
    * Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
posiciones impares
    * */
    String numero="50000";

    public void buscarPosImpares()
    {
        for(int i=0;i<this.numero.length();i++){
            if(i%3==0)//si estamos en una posicion impar
            {
                System.out.println(this.numero.charAt(i)+"|");
            }

        }

    }

}
