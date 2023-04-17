/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).

 */
package Guia5Java;

import java.util.Scanner;

/**
 * @author gralguillen
 */
public class extra2guia5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[] vector1 = new int[5];
       int[] vector2 = new int[5];
       for(int i=0;i<5;i++){
           System.out.println("Ingrese valor de vector1 en su posicion ["+i+"]");
           vector1[i]=leer.nextInt();
           System.out.println("Ingrese valor de vector1 en su posicion ["+i+"]");
           vector2[i]=leer.nextInt();
       }
       for(int i=0;i<5;i++){
           if(vector1[i]==vector2[i]){
               System.out.println("Son iguales");
           }else{
               System.out.println("Hay diferencia de valores en las posiciones "+i);
               break;
           }    
       }
        
    }
    
}
