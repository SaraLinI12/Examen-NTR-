package Examen1;

import java.util.Scanner;

/**
 * ExamenEjer2NTR
 */
public class ExamenEjer2NTR {
    static Scanner lt=new Scanner(System.in);
  public static void main(String[] args) {
     //Declarar variable
     double igv, precio, descuento=0, totalpago=0;
     //Datos de entrada
      System.out.println("Ingresar el precio del articulo");
      precio=lt.nextDouble();
     //Proceso
     if (precio>500) {
         descuento=precio*0.02;
         igv=0.18*totalpago;
         totalpago=precio-descuento;
        }
       else 
     if (precio>1000) {
         descuento=precio*0.05;
         igv=0.18*totalpago;
         totalpago=precio-descuento;

         }
        else 
     if (precio<2000) {
         descuento=precio*0.10;
         igv=0.18*totalpago;
         totalpago=precio-descuento;
    }  
    //Datos de salida 
    System.out.println("el descuento aplicado es: "+ descuento);
    System.out.println("el igv es: "+ igv);
    System.out.println("el importe total es de : "+ totalpago);
         
  }
      
  
   
}
