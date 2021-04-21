package com.company;

public class ejercicio_7 {
    /*
    *Programa Java que declare una variable C de tipo entero y asignarle un valor. A
continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
100.

    * */

    public  int C=2;

    public void CesPosOneg(){

        if(this.C<0)
        {
            System.out.println("C es negativo");
        }else {

            System.out.println("C es positivo");

        }
    }


    public void CesParOimp(){

        if(this.C%2==0)
        {
            System.out.println("C es par");
        }else {

            System.out.println("C es impar");

        }
    }


    public void CesMult5(){

        if(this.C%5==0)
        {
            System.out.println("C es multiplo de 5");
        }else {

            System.out.println("C no es multiplo de 5");

        }
    }
    public void CesMult10(){

        if(this.C%10==0)
        {
            System.out.println("C es multiplo de 10");
        }else {

            System.out.println("C no es multiplo de 10");

        }
    }

    public void CesMayoMen100(){

        if(this.C<100)
        {
            System.out.println("C es menor que 100");
        }else if (this.C==100)
        {
            System.out.println("C es igual a 100");
        }
            else {

            System.out.println("C es mayor que 100");

        }
    }

}
