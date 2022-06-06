
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;



public class Auto {

    
private String color;
private int patente;
private int combustible = 50;



public Auto () {}

  
void avanzar(int metros_a_avanzar){
  
       int avanzar_disponible = combustible / 10;
       System.out.println(" ");
       System.out.println("usted solicito avanzar el auto " + metros_a_avanzar +  " metros");

       System.out.println(" ");
if (metros_a_avanzar > 5){
         System.out.println("pero el auto solo puede avanzar " + avanzar_disponible + " metros segun la cantidad de combustible que tiene" );
  combustible -= avanzar_disponible * 10;
}
 else {combustible -= (avanzar_disponible * 10) + metros_a_avanzar;}
  
            }



  
void retroceder(){
  
       System.out.println("auto retrocedio");
    }





  void mostrar_combustible(){
    System.out.println(" ");
    System.out.println("tanque de combustible tiene:");
       System.out.println(combustible + " litros");
    }
  
    
void llenarTanque(){
  System.out.println(" ");
  System.out.println("tanque llenado con 50 litros");
  combustible = 50;

    }


}


 