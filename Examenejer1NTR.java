 package Examen1;

import java.util.Scanner;

/**
  * Examenejer1NTR
  */
 public class Examenejer1NTR {
     static Scanner lt=new Scanner(System.in);
   public static void main(String[] args) {
      //Declarar Variable
      double promedio,ExaDeConocimiento,EntrevPersonal,TestPsicologico;
      String mensaje="";
      //Datos de Salida
      System.out.print("Ingrese la nota de la entevista");
      EntrevPersonal=lt.nextInt();
      System.out.println("Ingrese nota del examen");
      ExaDeConocimiento=lt.nextInt();
      System.out.print("Ingrese nota del test");
      TestPsicologico=lt.nextInt();
     //Proceso
       if (EntrevPersonal<=20 && ExaDeConocimiento<=20 && TestPsicologico<=20){
           promedio=EntrevPersonal*0.35+ExaDeConocimiento*0.40+TestPsicologico*0.25;
        if (promedio<=20) {
            mensaje="El nivel correspondiente es 4";
        }
        if (promedio<17 && promedio>=14) {
            mensaje="El nivel correpondiente es 3";
        }
        if (promedio<14 && promedio>=11) {
            mensaje="El nivel correspondiente es 2";
        }
        if (promedio<11) {
            mensaje="El nivel correspondiente es 1";
             }     
    }  
       else {
           mensaje="Operacion no correcta";    }
           //Datos de salida
       System.out.println(mensaje);     
}

       









    } 

