/*
Escriba un programa que pida una frase o palabra y valide si
la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Substring y equals() de Java.

 */
package gralguillendev.apjava1;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class ejercicio4g3 {
    public static void main(String[] args){
    String frase;
    String parte;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
   // frase.substring(0,1).equalsIgnoreCase("a")
    
}



