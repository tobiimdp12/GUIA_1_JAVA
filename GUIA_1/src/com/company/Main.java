package com.company;

public class Main {

    public static void main(String[] args) {
        ejercicio_1 ej_1=new ejercicio_1();
        ejercicio_2 ej_2=new ejercicio_2();
        ejercicio_3 ej_3=new ejercicio_3();
        ejercicio_4 ej_4=new ejercicio_4();
        ejercicio_5 ej_5=new ejercicio_5();
        ejercicio_6 ej_6=new ejercicio_6();
        ejercicio_7 ej_7=new ejercicio_7();
        ejercicio_8 ej_8=new ejercicio_8();
        ejercicio_9 ej_9=new ejercicio_9();
        ejercicio_10 ej_10=new ejercicio_10();
        ejercicio_11 ej_11=new ejercicio_11();
        ejercicio_12 ej_12=new ejercicio_12();
        ejercicio_13 ej_13=new ejercicio_13();
        ejercicio_14 ej_14=new ejercicio_14();
        ejercicio_15 ej_15=new ejercicio_15();
        ejercicio_16 ej_16=new ejercicio_16();
        ejercicio_17 ej_17=new ejercicio_17();
        ejercicio_18 ej_18=new ejercicio_18();

        ej_1.imprimirValores();
        ej_1.sumarNyA();
        ej_1.restarAyN();
        ej_1.mostrarACSIIdeC();

        ej_2.sumarN_M_X_Y();
        ej_2.restarN_M_X_Y();
        ej_2.dividirMyX();
        ej_2.multiplicarNyY();

        ej_3.incrementarN();
        ej_3.reducirN();
        ej_3.duplicarN();

        System.out.println("intercambiando valores entre variables");
        ej_4.pasarValores();

        ej_5.parOimpar();

        ej_6.esPositivoOnegativo();

        ej_7.CesPosOneg();
        ej_7.CesParOimp();
        ej_7.CesMult5();
        ej_7.CesMult10();
        ej_7.CesMayoMen100();

        System.out.println("ingresa tu nombre");
        ej_8.obtenerNombre();
        ej_8.saludar();
        System.out.println("ingrese un numero \n");
        float numero=ej_9.setNumero();
        ej_9.dobleDelNumero(numero);
        ej_9.tripleDelNumero(numero);

        System.out.println("pasando de F a °C \n");
        ej_10.convertirFtoC();

        System.out.println("ingrese un radio \n");
        float radio= ej_11.obtenerRadio();
        ej_11.calcularArea(radio);
        ej_11.calcularLongitud(radio);
        System.out.println("ingrese una velocidad en KM/h \n");
        float velocidad=ej_12.obtenerVelocidad();
        ej_12.pasarKmAms(velocidad);

        double hipotenusa=ej_13.calcularHipotenusa();
        System.out.println("el valor de la hipotenusa es "+hipotenusa);

        float volumen=ej_14.calcularVolumen();
        System.out.println("el volumen de la esfera es "+volumen);

        float area=ej_15.calcularAreaTriangulo();
        System.out.println("el area del triangulo "+area);

        ej_16.separarNumero();
        System.out.println("--------------------------");
        ej_17.buscarPosImpares();

        ej_18.setH(30);
        ej_18.setM(30);
        ej_18.setS(50);

        boolean hora=ej_18.comprobarHora();
        boolean minutos=ej_18.comprobarMinutos();
        boolean segundos=ej_18.comprobarSegundos();

        if(hora)
        {
            System.out.println("la hora ingresada es correcta");
        }else
        {
            System.out.println("la hora ingresada no es correcta");
        }

        if(minutos)
        {
            System.out.println("los minutos ingresados son correctos");
        }else
        {
            System.out.println("los minutos ingresados no son correctos");
        }


        if(segundos)
        {
            System.out.println("los segundos ingresados  son correctos");
        }else
        {
            System.out.println("los segundos ingresados  no son correctos");
        }
    }
}
