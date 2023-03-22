/*
Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas por teclado e
indique si son mayores o menores de edad. Después de cada persona,
el programa debe preguntarle al usuario si quiere seguir mostrando
personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package gralguillendev.guia4JavaAP;

import java.util.Scanner;

public class ejer2Enc7y8 {
    public static void main(String[] args) {
       Datos();
    }
   
    
    
    public static void Datos() {
        boolean salir=false;
        String nombre, respuesta;
        int edad;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre de una persona");
            nombre = leer.nextLine();
            System.out.println("Ingrese la Edad de " + nombre);
            edad = leer.nextInt();
            System.out.println("==============================");
            System.out.println("Nombre: " + nombre + " Edad: " + edad);
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
                 System.out.println("==============================");
            }else{
            System.out.println("No es Mayor de edad");
             System.out.println("==============================");
            }
            
            System.out.println("Desea seguir ingresando datos?");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("no")){
                salir = true;
            }
        } while (salir==false);
    }
}

