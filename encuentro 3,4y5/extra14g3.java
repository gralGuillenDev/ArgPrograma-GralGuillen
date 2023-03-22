/*
Se dispone de un conjunto de N familias, cada una de las cuales
tiene una M cantidad de hijos. Escriba un programa que pida la
cantidad de familias y para cada familia la cantidad de hijos para 
averiguar la media de edad de los hijos de todas las familias.

 */
package gralguillendev.introjavaap;

import java.util.Scanner;

public class extra14g3 {

    public static void main(String[] args) {
        int H=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Familias");
        int F = leer.nextInt();
        for(int i=1;i<F+1;i++){
            System.out.println("Ingrese la cantidad de hijos de la Familia "+i);
            H = H + leer.nextInt();
        }
        ///ejercicio incompleto
    }  
}
