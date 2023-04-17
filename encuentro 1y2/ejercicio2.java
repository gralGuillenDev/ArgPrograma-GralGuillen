/*
 Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por pantalla.
 */
package gralguillendev.apjava1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Hola bienvenido "+nombre);  
          
    }
}
