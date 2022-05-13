package Examen1;
import java.util.Scanner;
public class ExamenEjer5NTR {
     static Scanner lt=new Scanner(System.in);
     public static void Examen1() {
         
     }
    public static void main(String[] args) {
    
        System.out.println("Ingrese  pregunta");
        int pregunta = lt.nextInt();
        switch (pregunta) {
          case 1:
          ExamenEjer1NTR(); break;
          case 2:
          ExamenEjer2NTR(); break;
          case 3:
          ExamenEjer3NTR(); break;
          case 4:
          ExamenEjer4NTR(); break;
            
            default: break;
        }
    } 
}
