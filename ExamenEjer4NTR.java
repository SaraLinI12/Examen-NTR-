package Examen1;
import java.util.Scanner;
public class ExamenEjer4NTR {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int edad;
        double sexo;
        String vacuna; 
        //Datos de Entrada
        System.out.print("Ingrese la edad del paciente:");
        edad=lt.nextInt();
        //Proceso
        
        if (edad>69) {
            vacuna="La vacuna que le corresponde es C";
        }else if(edad>16){
            System.out.println("Ingrese el sexo (F=femenino y M=masculino)");
            sexo= lt.nextDouble();
            vacuna="La vacuna que le corresponde es B"; 
        } else if(edad<16){
            vacuna="La vacuna que le corresponde es A";
        } else {
            vacuna="La vacuna que le corresponde es  A";
        }    
        //Datos de salida 
        System.out.println(vacuna);   
    }
        
}
