/*
 Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y después toda en minúsculas. 
 */
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] arg){
    Scanner lector = new Scanner(System.in);
    String frase;
        System.out.println("Ingresa una frase");
        frase = lector.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
    
    }
}
