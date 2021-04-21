package com.company;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;
public class ejercicio_18 {
    /*
    * Programa que lea tres números enteros H, M, S que contienen hora, minutos y
segundos respectivamente, y comprueba si la hora que indican es una hora válida.
    * */

    private int H;
    private int M;
    private int S;

    public boolean comprobarHora()
    {
        boolean horaValida;
        if(this.H<0 || this.H>23)//si la hora es negativa o mayor a 23
        {
            horaValida=false;
        }else
        {
            horaValida=true;
        }
        return horaValida;
    }

    public boolean comprobarMinutos()
    {
        boolean minutosValidos;
        if(this.M<0 || this.M>59)//si los minutos son negativos o mayores a 59
        {
            minutosValidos=false;
        }else
        {
            minutosValidos=true;
        }

        return minutosValidos;
    }

    public boolean comprobarSegundos()
    {
        boolean segundosValidos;
        if(this.S<0 || this.S>59)//si los segundos son negativos o mayores a 59
        {
            segundosValidos=false;
        }else
        {
            segundosValidos=true;
        }

        return segundosValidos;
    }
    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }
}
