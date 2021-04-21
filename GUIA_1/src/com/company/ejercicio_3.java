package com.company;

public class ejercicio_3 {
    /*
    *Programa Java que declare una variable entera N, asignarle un valor. A continuación
escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
valor a 3, duplicar su valor
    * */
    public  int N=1;


    public  int incrementarN(){

        while (this.N<=77) {
            this.N++;
        }
        return  this.N;
    }

    public  int reducirN(){

        while (this.N>=3) {
            this.N--;
        }
        return  this.N;
    }

    public  int duplicarN(){
        return  this.N*2;
    }
}
