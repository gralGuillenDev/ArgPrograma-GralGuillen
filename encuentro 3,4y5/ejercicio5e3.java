/*
Escriba un programa en el cual se ingrese un valor límite positivo
y a continuación solicite números al usuario hasta que la suma de
los números introducidos supere el límite inicial.
 */
package gralguillendev.apjava1;

import java.util.Scanner;


public class ejercicio5e3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int valorLimite;
        int suma = 0;
        do{
        System.out.println("Ingrese un valor limite");
        valorLimite = leer.nextInt();
        }while(valorLimite<0);
        
        do{
            System.out.println("Ingrese un numero");
            suma = suma + leer.nextInt();
        }while(suma<=valorLimite);
        
        System.out.println("La suma total es "+suma+" y a superado el numero "+valorLimite);
    }
}
