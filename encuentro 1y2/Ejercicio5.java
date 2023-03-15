/*
Escribir un programa que lea un número entero por teclado y
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 */
package gralguillendev.apjava1;

import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        
        Scanner teclado =  new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num = teclado.nextInt();
        //Math.sqrt()
        System.out.println("El dobre de tu numero es "+2*num);
        System.out.println("El triple de tu numero es "+3*num);
        System.out.println("La raiz cuadrada de tu numero es "+ Math.sqrt(num));
    }
}

