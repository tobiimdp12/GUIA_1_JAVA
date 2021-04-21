package com.company;

public class ejercicio_4 {

    /*
    * Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
cada una. A continuación realiza las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.

* B=C
* C=A
* A=D
* D=B
* */

    public int A=2;
    public int B=32;
    public int Brespaldo=32;
    public int C=22;
    public int D=12;

    public void pasarValores(){
        this.B=this.C;
        this.C=this.A;
        this.A=this.D;
        this.D=this.Brespaldo;

    }
}
