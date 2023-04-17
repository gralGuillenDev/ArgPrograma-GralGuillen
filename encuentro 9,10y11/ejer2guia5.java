/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package Guia5Java;

import java.util.Scanner;

public class ejer2guia5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese el tamanio del vector");
        int n = entrada.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (10 + 1));
        }
        for (int j = 0; j < vector.length; j++) {
            System.out.println(vector[j]);
        }

        System.out.println("Que numero deseas buscar?");
        int num = entrada.nextInt();
        for (int j = 0; j < vector.length; j++) {
            while (cont == 0) {
                if (vector[j] == (num)) {
                    System.out.println("Tu numero se encuentra en vector[" + j + "]");
                    cont++;
                } else {
                    break;
                }
            }
            if (cont == 1) {
                cont++;
                break;
            }else{
                if(cont>1 && vector[j] == num){
                    System.out.println("tambien se repite en el vector[" + j + "]");
                }
            }
        }
    }
}
