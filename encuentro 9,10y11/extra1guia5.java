/*
Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el usuario.

 */
package Guia5Java;

import java.util.Scanner;

/**
 *
 * @author gralguillen
 */
public class extra1guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = (int)(Math.random()*10-1);
        int suma=0;
        int[] vector= new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Ingrese un valor para la posicion ["+i+"]");
            vector[i]=leer.nextInt();
        }
        for(int i=0;i<n;i++){
            suma += vector[i];
        }
        System.out.println("la suma es "+suma);
    }
    
}
